package com.cogent.week02.day07.AggregationComposition;

public class Car {
    // engine is a representation of composition as the car needs the engine to run
    private final Engine engine;
    // music system is a representation of aggregation as the car can run without the music system
    private MusicSystem ms;

    public Engine getEngine() {
        return engine;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public MusicSystem getMs() {
        return ms;
    }

    public void setMs(MusicSystem ms) {
        this.ms = ms;
    }

    public void start() {
        System.out.println("Car engine " + this.engine.getType() + " started");
    }

    public void stop() {
        System.out.println("Car engine " + this.engine.getType() + " stopped");

    }

    public void showMusicSystemInfo() {
        System.out.println("Music system code " + ms.getId());
        System.out.println("Music system name " + ms.getType());
    }
}
