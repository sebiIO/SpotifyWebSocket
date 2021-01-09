/*
 *  Created by SpyderScript on 20.12.2020, 16:18.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.item;

import com.google.gson.annotations.SerializedName;
import me.sebi.spotifywebsocket.json.spotifywebsocket.misc.ExternalUrls;

public class Artist {
    @SerializedName("external_urls")
    private ExternalUrls externalUrls;

    private String href, id, name, type, uri;

    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }
}
