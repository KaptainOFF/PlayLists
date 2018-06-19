package com.kapitanov;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayList {
    private static Scanner scanner = new Scanner(System.in);
    private List<Song> playList;
    private String name;

    public PlayList(String name) {
        this.name = name;
        this.playList = new LinkedList<>();
    }

    public boolean addSongToPlaylist(String songName, List<Album> albums) {
        for (Album album : albums) {
            List<Song> scanSongs = album.getTracks();
            for (Song song : scanSongs) {
                if (song.getTitle().equals(songName)) {
                    playList.add(song);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void listAllSongs(List<Song> list) {
        for (int i=0;i < list.size();i++) {
            System.out.println("[" + (i+1) +"] " + list.get(i).getTitle());
        }
    }

}
