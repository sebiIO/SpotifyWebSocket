/*
 *  Created by SpyderScript on 20.12.2020, 16:03.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload;

import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.EventData;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.User;

public class Event {
    private String source, type, uri, href;
    private EventData event;
    private User user;

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

    public String getHref() {
        return href;
    }

    public EventData getEvent() {
        return event;
    }

    public User getUser() {
        return user;
    }
}
