/*
 *  Created by SpyderScript on 20.12.2020, 16:04.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event;

import com.google.gson.annotations.SerializedName;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.State;

public class EventData {
    @SerializedName("event_id")
    private long eventId;

    private State state;

    public long getEventId() {
        return eventId;
    }

    public State getState() {
        return state;
    }
}
