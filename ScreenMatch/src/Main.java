import br.com.alura.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("\nChainsaw Man - The Movie: Reze Arc");
        myMovie.setReleaseYear(2025);  // Estimated release window
        myMovie.setDurationInMinutes(100); // Estimated duration
        myMovie.setIncludedInPlan(true);

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