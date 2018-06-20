package com.kapitanov;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Album> albums;
    private static List<PlayList> playList;

    public static void main(String[] args) {
	// write your code here
    }

    public void crateAlbum() {
        System.out.print("Please provide name of album: ");
        String albumName = scanner.nextLine();
        System.out.print("Please provide name of the band: ");
        String bandName = scanner.nextLine();
        Album albumToAdd = new Album(albumName, bandName);
        if (!this.albums.contains(albumToAdd)) {
            this.albums.add(albumToAdd);
        } else {
            System.out.println("Album already added.");
        }
    }

    public void addSongsToAlbum() {
        System.out.print("Please provide name of album: ");
        String albumName = scanner.nextLine();
        System.out.print("Please provide name of the song: ");
        String songName = scanner.nextLine();
        System.out.print("Please provide the duration of the song: ");
        String duration = scanner.nextLine();

       if (findAlbum(albumName) != null) {
           findAlbum(albumName).addTrack(songName, duration);
       } else {
           System.out.println("Error adding song");
       }
    }

    private static Album findAlbum(String albumName) {
        for (Album album : albums) {
            if (album.getName().equals(albumName)) {
                return album;
            }
        }
        return null;
    }

    private static void printMenu() {


    }
}
