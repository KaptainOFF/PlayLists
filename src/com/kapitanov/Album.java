package com.kapitanov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Album {
    private static Scanner scanner = new Scanner(System.in);
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

    private boolean addTrack(String songName, String duration) {
        Song song = new Song(songName, duration);
        if (!tracks.contains(song)) {
            tracks.add(song);
            return true;
        } else {
            return false;
        }
    }
}
