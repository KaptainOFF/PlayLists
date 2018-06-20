package com.kapitanov;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Album> albums;
    private static List<PlayList> playList;

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        System.out.println("What would you like to do? (Press 0 for options)");
        int choice = scanner.nextInt();

        while (!quit) {
            switch (choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    crateAlbum();
                    break;
                case 2:
                    addSongsToAlbum();
                    break;
                case 3:
                    createPlaylist();
                    break;
            }
        }
    }

    public static void crateAlbum() {
        System.out.print("Please provide name of album: ");
        String albumName = scanner.nextLine();
        System.out.print("Please provide name of the band: ");
        String bandName = scanner.nextLine();
        Album albumToAdd = new Album(albumName, bandName);
        if (!albums.contains(albumToAdd)) {
            albums.add(albumToAdd);
        } else {
            System.out.println("Album already added.");
        }
    }

    public static void addSongsToAlbum() {
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

    public static void createPlaylist() {
        System.out.print("Please provide name of the playlist: ");
        String playListName = scanner.nextLine();
        PlayList list = new PlayList(playListName);
        if (!playList.contains(list)){
            playList.add(list);
        } else {
            System.out.println("A list with this name already exists");
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
        System.out.println("0 - help menu \n" +
                        "1 - add album \n" +
                        "2 - add song to album \n" +
                        "3 - create playlist \n" +
                        "4 - list all songs in the playlist \n" +
                        "5 - add song to playlist \n" +
                        "6 - skip to next song \n" +
                        "7 - play previous song \n" +
                        "8 - repeat current song \n");


    }
}
