import br.com.alura.screenmatch.calculos.TimeCalculator;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

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


        Movie anotherMOvie = new Movie();

        anotherMOvie.setName("\nSword Art Online: Ordinal Scale");
        anotherMOvie.setReleaseYear(2018);  // Estimated release window
        anotherMOvie.setDurationInMinutes(150); // Estimated duration
        anotherMOvie.setIncludedInPlan(true);


        Serie mySerie =  new Serie();
        mySerie.setName("Alchemy o Souls");
        mySerie.setSeason(2);
        mySerie.setEpisodesPerSeason((10 + 20)/2);
        mySerie.setOngoing(false);
        mySerie.setMinutesPerEpisode(80);
        mySerie.setReleaseYear(2022);
        System.out.println("\n");
        mySerie.showInfo();

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(anotherMOvie);
        calculator.include(myMovie);
        calculator.include(mySerie);
        System.out.println(calculator.getTotalTime());
    }
}