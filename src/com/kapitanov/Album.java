package com.kapitanov;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private List<Song> tracks;
    private String name;
    private String band;

    public Album(String name, String band) {
        this.name = name;
        this.band = band;
        this.tracks = new ArrayList<>();
    }

    public List<Song> getTracks() {
        return tracks;
    }

    public String getName() {
        return name;
    }

    public String getBand() {
        return band;
    }

    public boolean addTrack(String songName, String duration) {
        Song song = new Song(songName, duration);
        if (!tracks.contains(song)) {
            tracks.add(song);
            return true;
        } else {
            return false;
        }
    }
}
