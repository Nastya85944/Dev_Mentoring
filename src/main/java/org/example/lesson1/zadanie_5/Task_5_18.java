package org.example.lesson1.zadanie_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_5_18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> albums = new HashMap<>();
        albums.put("The Sensual World", "Kate Bush");
        albums.put("Shaday", "Ofra Haza");
        albums.put("Achtung Baby", "U2");
        albums.put("Aion", "Dead Can Dance");
        albums.put("Invisible Touch", "'Genesis");

        displayAlbumsName(albums);
        System.out.print("Enter an album name from the list above: ");

        String albumName = scanner.next();
        if (checkIfAlbumExist(albums, albumName)) {
            displayAlbumsData(albums, albumName);
        } else {
            System.out.println("No data");
        }

        addAlbum(albums,scanner);
        removeAlbum(albums, scanner);
    }

    public static void displayAlbumsName(Map<String, String> albums) {
        for (String name : albums.keySet()) {
            System.out.println(name);
        }
    }

    public static void displayAlbumsData(Map<String, String> albums, String albumName) {
        for (Map.Entry<String, String> entry : albums.entrySet()) {
            if (albumName.equalsIgnoreCase(entry.getKey())) {
                System.out.println("The artist of the album " + entry.getKey() + " is " + entry.getValue());
            }
        }
    }

    public static boolean checkIfAlbumExist(Map<String, String> albums, String albumName) {
        return albums.containsKey(albumName);
    }

    public static void addAlbum(Map<String, String> albums, Scanner scanner) {
        System.out.print("Do you want to add a new album? Y/N: ");
        String albumAdding = scanner.next();
        if (albumAdding.equalsIgnoreCase("Y")) {
            System.out.print("Enter a new album name: ");
            String albumName = scanner.next();
            if(!checkIfAlbumExist(albums, albumName)){
                System.out.print("Enter the artist name: ");
                String artist = scanner.next();
                albums.put(albumName, artist);
            }
        }
        System.out.println("----Albums list after adding a new one---");
        displayAlbumsName(albums);
    }

    public static void removeAlbum(Map<String, String> albums, Scanner scanner) {
        System.out.print("Do you want to delete an album? Y/N: ");
        String albumRemoving = scanner.next();
        if (albumRemoving.equalsIgnoreCase("Y")) {
            System.out.print("Enter an album name: ");
            String albumName = scanner.next();
            if(checkIfAlbumExist(albums, albumName)) {
                albums.remove(albumName);
                System.out.println("----Albums list after removing---");
                displayAlbumsName(albums);
            } else{
                System.out.println("No album in the list for removing");
            }
        }

    }
}
