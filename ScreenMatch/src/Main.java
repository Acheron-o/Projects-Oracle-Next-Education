public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Chainsaw Man - The Movie: Reze Arc";
        myMovie.releaseYear = 2025; // Estimated release window
        myMovie.durationInMinutes = 100; // Estimated duration
        myMovie.includedInPlan = true;

        // displaying info
        myMovie.showInfo();

        // Rating the movie
        myMovie.rate(9.5);
        myMovie.rate(8.0);
        myMovie.rate(10.0);

        // Printing results
        System.out.println("Total ratings: " + myMovie.getTotalRatings());
        System.out.printf("Average rating:  %.2f", myMovie.getAverage());
    }
}