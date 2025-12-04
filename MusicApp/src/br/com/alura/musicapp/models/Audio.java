package br.com.alura.musicapp.models;

public class Audio {
    private String title;
    private int duration;
    private int totalPlays;
    private int likes;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getLikes() {
        return likes;
    }

    public int getRating() {
        return rating;
    }

    public void like() {
        this.likes++;
    }

    public void play(){
        this.totalPlays++;
    }

}
