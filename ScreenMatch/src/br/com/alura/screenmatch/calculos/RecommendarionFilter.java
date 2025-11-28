package br.com.alura.screenmatch.calculos;

public class RecommendarionFilter {
    private String recommendation;

    public void filter (Ratings ratings) {
        if (ratings.getRatings() >= 4) {
            System.out.println("It is among the most watched ones at this moment.");
        } else if (ratings.getRatings() >= 2) {
            System.out.println("It is being well rated.");
        } else {
            System.out.println("I'd recommend pining it on your list, to watch later.");
        }
    }
}
