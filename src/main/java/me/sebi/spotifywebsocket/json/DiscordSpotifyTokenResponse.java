/*
 *  Created by SpyderScript on 20.12.2020, 15:48.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json;

import com.google.gson.annotations.SerializedName;

public class DiscordSpotifyTokenResponse {
    @SerializedName("access_token")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }
}
