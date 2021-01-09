/*
 *  Created by SpyderScript on 20.12.2020, 16:05.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state;

import com.google.gson.annotations.SerializedName;

public class Device {
    private String id;

    @SerializedName("is_active")
    private boolean isActive;

    @SerializedName("is_private_session")
    private boolean isPrivateSession;

    @SerializedName("is_restricted")
    private boolean isRestricted;

    private String name;
    private String type;

    @SerializedName("volume_percent")
    private int volumePercent;

    public String getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isPrivateSession() {
        return isPrivateSession;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getVolumePercent() {
        return volumePercent;
    }
}
