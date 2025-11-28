package br.com.alura.musicapp.models;

public class MyFavorites {
    public void include(Audio audio) {
        if(audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " is onsidered an absolute sucess, being recommended to everyone");
        } else {
            System.out.println(audio.getTitle() + " also is one of the most talked ones.");
        }
    }

}
