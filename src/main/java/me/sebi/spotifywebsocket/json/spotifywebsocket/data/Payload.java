/*
 *  Created by SpyderScript on 20.12.2020, 16:02.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data;

import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.Event;

public class Payload {
    private Event[] events;

    public Event[] getEvents() {
        return events;
    }
}
