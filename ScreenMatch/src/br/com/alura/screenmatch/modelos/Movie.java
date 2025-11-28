package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Ratings;

public class Movie extends Title implements Ratings {
    private String dir;

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public int getRatings() {
        return (int) getAverage() / 2;
    }
}

