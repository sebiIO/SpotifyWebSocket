/*
 *  Created by SpyderScript on 20.12.2020, 16:36.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.misc;

import com.google.gson.annotations.SerializedName;

public class LinkedFrom {
    @SerializedName("external_urls")
    private ExternalUrls externalUrls;

    private String href;
    private String id;
    private String type;
    private String uri;

    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }
}
