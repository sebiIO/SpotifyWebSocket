/*
 *  Created by SpyderScript on 20.12.2020, 15:59.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket;

import me.sebi.spotifywebsocket.json.spotifywebsocket.data.Headers;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.Payload;

public class SpotifyWebsocketMessage {
    private Headers headers;
    private Payload[] payloads;
    private String type, uri;

    public Headers getHeaders() {
        return headers;
    }

    public Payload[] getPayloads() {
        return payloads;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }
}
