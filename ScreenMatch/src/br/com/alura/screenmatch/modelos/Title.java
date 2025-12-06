package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Title {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean includedInPlan;
    private double sumOfRatings;
    private int totalRatings;
    private int durationInMinutes;
    @SerializedName("Genre")
    private String genre;

    public Title(TituloOmd myTitleOmdb) {

    }

    public void showInfo() {
        System.out.println("Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Duration: " + durationInMinutes + " minutes");
    }

    public void rate(double rating) {
        sumOfRatings += rating;
        totalRatings++;
    }

    public double getAverage() {
        return sumOfRatings / totalRatings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public double getSumOfRatings() {
        return sumOfRatings;
    }

    public void setSumOfRatings(double sumOfRatings) {
        this.sumOfRatings = sumOfRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
