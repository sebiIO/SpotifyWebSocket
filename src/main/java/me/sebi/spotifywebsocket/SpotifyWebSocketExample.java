/*
 *  Created by SpyderScript on 20.12.2020, 15:41.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket;

import com.google.gson.Gson;
import me.sebi.spotifywebsocket.api.DiscordSpotifyAPI;
import me.sebi.spotifywebsocket.json.spotifywebsocket.SpotifyWebsocketMessage;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.EventData;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.Item;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.item.Artist;
import me.sebi.spotifywebsocket.net.WebsocketClientEndpoint;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SpotifyWebSocketExample {
    public static void main(String[] args) {
        Gson gson = new Gson();

        DiscordSpotifyAPI discordSpotifyAPI = new DiscordSpotifyAPI();

        String accessToken = discordSpotifyAPI.getSpotifyAccessToken("[DISCORD TOKEN HERE]", "[SPOTIFY UID HERE]");

        if (accessToken == null) {
            System.exit(-1);
        }

        try {
            // the dealer uri's can be fetched from https://apresolve.spotify.com/?type=dealer

            // open websocket
            final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(new URI("wss://dealer.spotify.com/?access_token=" + accessToken));

            // add listener
            clientEndPoint.addMessageHandler(message -> {
                SpotifyWebsocketMessage websocketMessage = gson.fromJson(message, SpotifyWebsocketMessage.class);

                if (websocketMessage.getType().equals("pong")) {
                    System.out.println("Received 'pong' response.");
                    return;
                }

                if (websocketMessage.getHeaders().getSpotifyConnectionId() != null) {
                    System.out.println("Spotify Connection Id received. We need to register the websocket next ...");
                    discordSpotifyAPI.registerWebsocket(websocketMessage.getHeaders().getSpotifyConnectionId(), accessToken);
                } else {
                    EventData eventData = websocketMessage.getPayloads()[0].getEvents()[0].getEvent();
                    switch (websocketMessage.getPayloads()[0].getEvents()[0].getType()) {
                        case "PLAYER_STATE_CHANGED":
                            Item item = eventData.getState().getItem();
                            System.out.println("Currently playing: " + item.getName() + " by " + Arrays.stream(item.getArtists()).map(Artist::getName).collect(Collectors.joining(", ")) + " @" + eventData.getState().getProgressMs() + "ms [isPlaying=" + eventData.getState().isPlaying() + "]");
                            break;
                        case "DEVICE_STATE_CHANGED":
                            System.out.println("User changed playback device.");
                            break;
                        default:
                            System.out.println("Unhandled eventType '" + websocketMessage.getPayloads()[0].getEvents()[0].getType() + "'");
                            break;
                    }
                }
            });

            // send ping to server every 30 seconds (otherwise the server would close the connection)
            while (true) {
                if (clientEndPoint.isConnected()) {
                    System.out.println("Sending 'ping' to websocket ...");
                    clientEndPoint.sendMessage("{\"type\": \"ping\"}");
                }
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (URISyntaxException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        }
    }
}
