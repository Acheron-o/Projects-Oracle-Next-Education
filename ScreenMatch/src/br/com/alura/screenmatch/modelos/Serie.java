package br.com.alura.screenmatch.modelos;

public class Serie extends Title {
    private int season;
    private int episodesPerSeason;
    private boolean ongoing;
    private int minutesPerEpisode;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean isOngoing() {
        return ongoing;
    }

    public void setOngoing(boolean ongoing) {
        this.ongoing = ongoing;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return episodesPerSeason * season * minutesPerEpisode;
    }

    @Override
    public void showInfo() {
        System.out.println("Series Name: " + getName());
        System.out.println("Release Year: " + getReleaseYear());
        System.out.println("Duration: " + getDurationInMinutes() + " minutes");
    }
}
