package br.com.alura.musicapp.models;

public class Podcasts extends Audio{
    private String host;
   private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRating() {
        if(this.getLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
