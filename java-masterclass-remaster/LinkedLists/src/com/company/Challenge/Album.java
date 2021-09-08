package com.company.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;

    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;

    }


//         LinkedList<String> linkedList = new LinkedList<>();
//        ListIterator<String> stringListIterator = linkedList.listIterator();
//        while (stringListIterator.hasNext()){
//            int comparison = stringListIterator.next().compareTo(title);
//            if(comparison == 0){
//                return false;
//            } else if( comparison >0){
//                stringListIterator.previous();
//                stringListIterator.add(title);
////                stringListIterator.add(toString(duration));
//                return true;
//            } else if(comparison < 0);
//
//        }
//        stringListIterator.add(title);
//        return true;


    public Song findSong(String title) {

        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;

    }

    public boolean addToPlayList(int trackNumber,LinkedList<Song> playList){
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }


    public boolean addToPlayList(String title,LinkedList<Song>playList){
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;

    }


//        LinkedList<String> linkedList = new LinkedList<>();
//        ListIterator<String> stringListIterator = linkedList.listIterator();
//        while (stringListIterator.hasNext()){
//            int comparison = stringListIterator.next().compareTo(title);
//            if(comparison == 0){
//                return title;
//            } else if( comparison >0){
//                stringListIterator.previous();
//                stringListIterator.add(title);
////                stringListIterator.add(toString(duration));
//                return title;


}