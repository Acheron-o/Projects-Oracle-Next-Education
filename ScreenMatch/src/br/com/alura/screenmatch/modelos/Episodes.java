package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Ratings;

public class Episodes implements Ratings {
    private int number;
    private String name;
    private Serie series;
    private int totalVisualizations;

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public void setTotalVisualizations(int totalVisualizations) {
        this.totalVisualizations = totalVisualizations;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSeries() {
        return series;
    }

    public void setSeries(Serie series) {
        this.series = series;
    }

    @Override
    public int getRatings() {
        if (totalVisualizations >= 100) {
            return 4;
        }
        else {
            return 2;
        }
    }
}
