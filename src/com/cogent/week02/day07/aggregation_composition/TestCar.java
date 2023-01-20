package com.cogent.week02.day07.aggregation_composition;

public class TestCar {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setType("turbo");
        MusicSystem ms = new MusicSystem(1, "turbo");

        Car Honda = new Car(engine);
        Honda.setMs(ms);

        MusicSystem ms2 = new MusicSystem();
        ms2.setId(2);
        ms2.setType("regular");
        Engine e2 = new Engine();
        e2.setType("regular");

        Car toyota = new Car(e2);
        toyota.setMs(ms2);

        Honda.start();
        toyota.start();

        toyota.stop();
        Honda.stop();

        toyota.showMusicSystemInfo();
        Honda.showMusicSystemInfo();
    }
}
