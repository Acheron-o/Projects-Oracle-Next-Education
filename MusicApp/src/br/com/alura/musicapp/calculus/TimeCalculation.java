package br.com.alura.musicapp.calculus;

import br.com.alura.musicapp.models.Audio;

public class TimeCalculation {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include (Audio a) {
        this.totalTime += a.getDuration();
    }
}
