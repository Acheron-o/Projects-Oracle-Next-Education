package br.com.alura.musicapp.main;

import br.com.alura.musicapp.models.Musics;
import br.com.alura.musicapp.models.MyFavorites;
import br.com.alura.musicapp.models.Podcasts;

public  class Main {
    public static void main(String[] args) {
        Musics myMusic = new Musics();
        myMusic.setTitle("Iris Out");
        myMusic.setArtist("Kenshi Yonezu");
        myMusic.setGenre("Japanese Rock");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50 ; i++) {
            myMusic.like();
        }
        System.out.println("The music:");
        System.out.println(myMusic.getTitle());
        System.out.println(myMusic.getArtist());
        System.out.println(myMusic.getGenre());
        System.out.println("Number of likes: " + myMusic.getLikes());
        System.out.println("Number of times played: " + myMusic.getTotalPlays());
        System.out.println("Rating: " + myMusic.getRating());

        for (int i = 0; i < 5000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 250 ; i++) {
            myMusic.like();
        }

        Podcasts myPodcast = new Podcasts();
        myPodcast.setTitle("Jobless Reincarnation");
        myPodcast.setHost("Rudeus");
        myPodcast.setDescription("Rudeus, the greatest magician of Northern Region, talks openly about his adventures and gives advices of how to live a better life.");

        System.out.println("\nPodcast: ");
        System.out.println(myPodcast.getTitle());
        System.out.println(myPodcast.getHost());
        System.out.println(myPodcast.getDescription());
        System.out.println("Rating: " + myPodcast.getRating());
        MyFavorites favorites = new MyFavorites();
        System.out.println("===============================");
        System.out.println("\n");
        favorites.include(myMusic);
        favorites.include(myPodcast);

    }





}