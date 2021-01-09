/*
 *  Created by SpyderScript on 20.12.2020, 16:14.
 *  Project: SpotifyWebSocket.
 *  Copyright (c) 2020.
 */

package me.sebi.spotifywebsocket.json.spotifywebsocket.data.payload.event.data.state.item;

import com.google.gson.annotations.SerializedName;
import me.sebi.spotifywebsocket.json.spotifywebsocket.misc.ExternalUrls;

public class Album {
    @SerializedName("album_type")
    private String albumType;

    private Artist[] artists;

    @SerializedName("external_urls")
    private ExternalUrls externalUrls;

    private String href;

    private String id;

    private Image[] images;

    private String name;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("release_date_precision")
    private String releaseDatePrecision;

    @SerializedName("total_tracks")
    private int totalTracks;

    private String type;

    private String uri;

    public String getAlbumType() {
        return albumType;
    }

    public Artist[] getArtists() {
        return artists;
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

    public Image[] getImages() {
        return images;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    public int getTotalTracks() {
        return totalTracks;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }
}
