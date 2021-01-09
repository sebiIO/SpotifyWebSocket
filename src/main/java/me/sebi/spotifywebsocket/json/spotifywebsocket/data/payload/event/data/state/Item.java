/*
 *  Created by SpyderScript on 20.12.2020, 16:14.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state;

import com.google.gson.annotations.SerializedName;
import me.sebi.spotifywebsocket.json.spotifywebsocket.misc.ExternalIds;
import me.sebi.spotifywebsocket.json.spotifywebsocket.misc.ExternalUrls;
import me.sebi.spotifywebsocket.json.spotifywebsocket.misc.LinkedFrom;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.item.Album;
import me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.item.Artist;

public class Item {
    private Album album;

    private Artist[] artists;

    @SerializedName("disc_number")
    private int discNumber;

    @SerializedName("duration_ms")
    private int durationMs;

    private boolean explicit;

    @SerializedName("external_ids")
    private ExternalIds externalIds;

    @SerializedName("external_urls")
    private ExternalUrls externalUrls;

    private String href;
    private String id;

    @SerializedName("is_local")
    private boolean isLocal;

    @SerializedName("is_playable")
    private boolean isPlayable;

    @SerializedName("linked_from")
    private LinkedFrom linkedFrom;

    private String name;

    private int popularity;

    @SerializedName("preview_url")
    private String previewUrl;

    @SerializedName("track_number")
    private String trackNumber;

    private String type;

    private String uri;

    public Album getAlbum() {
        return album;
    }

    public Artist[] getArtists() {
        return artists;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public int getDurationMs() {
        return durationMs;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public ExternalIds getExternalIds() {
        return externalIds;
    }

    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public LinkedFrom getLinkedFrom() {
        return linkedFrom;
    }

    public String getName() {
        return name;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }
}
