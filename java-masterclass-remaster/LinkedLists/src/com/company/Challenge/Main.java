package com.company.Challenge;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Storembringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Holy man", 3.6);
        album.addSong("Hold on", 4.7);
        album.addSong("High ball shooter", 7.32);
        album.addSong("the gypsy", 4.33);
        album.addSong("Soldier of fortune", 2.90);
        albums.add(album);

        album = new Album("for those about to rock", "AC/DC");
        album.addSong("For those about to rock", 3.22);
        album.addSong("Thunderstruck", 4.98);
        album.addSong("Snowballed", 3.53);
        album.addSong("Evil walks", 3.99);
        album.addSong("C.O.D", 4.56);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Hold on", playList);
        albums.get(0).addToPlayList("the gypsy", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList(1, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(5, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        printMenu();
                    } else {
                        System.out.println("We are at the start of the playlist.");
                    }
                    break;
                case 3:
                    if(forward){
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the emd of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next());
                        } else if ( listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous()) ;
                        }
                    }
                    break;

            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to play the current song\n" +
                "4- list songs in the playlist\n" +
                "5 - print available actions.\n"+
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("======================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====================");
    }


}
