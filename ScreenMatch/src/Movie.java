
    public class Movie {
        String name;
        int releaseYear;
        boolean includedInPlan;
        private double sumOfRatings;
        private int totalRatings;
        int durationInMinutes;

        void showInfo() {
            System.out.println("Movie Name: " + name);
            System.out.println("Release Year: " + releaseYear);
            System.out.println("Duration: " + durationInMinutes + " minutes");
        }

        void rate(double rating) {
            sumOfRatings += rating;
            totalRatings++;
        }

        double getAverage() {
            return sumOfRatings / totalRatings;
        }

        int getTotalRatings(){
            return totalRatings;
        }
    }

