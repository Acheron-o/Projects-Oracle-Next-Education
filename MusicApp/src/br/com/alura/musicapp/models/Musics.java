package br.com.alura.musicapp.models;

public class Musics extends Audio {
    private String artist;
    private String album;
    private String genre;
    private int releaseYear;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public int getRating() {
        if(this.getTotalPlays() > 200) {
            return 10;
        } else {
            return 7;
        }
    }
}
