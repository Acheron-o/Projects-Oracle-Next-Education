package br.com.alura.screenmatch.modelos;

public class Movie {
        private String name;
        private int releaseYear;
        private boolean includedInPlan;
        private double sumOfRatings;
        private int totalRatings;
        private int durationInMinutes;

        public void showInfo() {
            System.out.println("br.com.alura.screenmatch.modelos.Movie Name: " + name);
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

        public int getTotalRatings(){
            return totalRatings;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}

