/*
 *  Created by SpyderScript on 20.12.2020, 16:00.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data;

import com.google.gson.annotations.SerializedName;

public class Headers {
    @SerializedName("Spotify-Connection-Id")
    private String spotifyConnectionId;

    public String getSpotifyConnectionId() {
        return spotifyConnectionId;
    }
}
