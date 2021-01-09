/*
 *  Created by SpyderScript on 20.12.2020, 16:04.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data;

import com.google.gson.annotations.SerializedName;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.Actions;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.Context;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.Device;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.Item;

public class State {
    private Device device;

    @SerializedName("shuffle_state")
    private boolean shuffleState;

    @SerializedName("repeat_state")
    private String repeatState;

    private long timestamp;

    private Context context;

    @SerializedName("progress_ms")
    private int progressMs;

    private Item item;

    @SerializedName("currently_playing_type")
    private String currentlyPlayingType;

    private Actions actions;

    @SerializedName("is_playing")
    private boolean isPlaying;

    public Device getDevice() {
        return device;
    }

    public boolean isShuffleState() {
        return shuffleState;
    }

    public String getRepeatState() {
        return repeatState;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Context getContext() {
        return context;
    }

    public int getProgressMs() {
        return progressMs;
    }

    public Item getItem() {
        return item;
    }

    public String getCurrentlyPlayingType() {
        return currentlyPlayingType;
    }

    public Actions getActions() {
        return actions;
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
