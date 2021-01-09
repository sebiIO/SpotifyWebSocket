/*
 *  Created by SpyderScript on 20.12.2020, 15:45.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.api;

import com.google.gson.Gson;
import me.sebi.spotifywebsocket.json.DiscordSpotifyTokenResponse;
import me.sebi.spotifywebsocket.json.WebsocketRegistrationResponse;
import okhttp3.*;

import java.io.IOException;
import java.util.Objects;

public class DiscordSpotifyAPI {
    private final OkHttpClient client = new OkHttpClient();
    private final Gson gson = new Gson();

    /**
     *
     * @param uid Spotify uuid
     * @return Spotify access-token
     */
    public String getSpotifyAccessToken(String discordToken, String uid) {
        System.out.println("Retrieving access token ...");
        String url = "https://discord.com/api/v8/users/@me/connections/spotify/" + uid + "/access-token";

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", discordToken)
                .get()
                .build();

        try {
           Response response = client.newCall(request).execute();
           return gson.fromJson(Objects.requireNonNull(response.body()).string(), DiscordSpotifyTokenResponse.class).getAccessToken();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void registerWebsocket(String connectionId, String accessToken) {
        System.out.println("Registering websocket ...");
        String url = "https://api.spotify.com/v1/me/notifications/player?connection_id=" + connectionId;

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", "Bearer " + accessToken)
                .put(RequestBody.create(new byte[0]))
                .build();

        try {
            String res = Objects.requireNonNull(client.newCall(request).execute().body()).string();
            String message = gson.fromJson(res, WebsocketRegistrationResponse.class).getMessage();
            System.out.println("[Websocket Registration] Message from API-Server: " + res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
