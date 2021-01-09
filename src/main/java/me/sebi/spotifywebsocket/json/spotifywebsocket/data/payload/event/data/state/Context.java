/*
 *  Created by SpyderScript on 20.12.2020, 16:11.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state;

import com.google.gson.annotations.SerializedName;
import me.sebi.spotifywebsocket.json.spotifywebsocket.misc.ExternalUrls;

public class Context {
    @SerializedName("external_urls")
    private ExternalUrls externalUrls;

    private String href, type, uri;

    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    public String getHref() {
        return href;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }
}
