package com.cogent.assignments.Day02.Q1;

public class TestInstrument {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[] {
                new Guitar(),
                new Piano(),
                new Flute(),
                new Piano(),
                new Piano(),
                new Guitar(),
                new Guitar(),
                new Flute(),
                new Flute(),
                new Guitar(),
        };

        for(Instrument instrument: instruments) {
            instrument.play();
            System.out.println("this instrument is a " + instrument.getClass().getSimpleName());
            System.out.println("");
        }
    }
}
