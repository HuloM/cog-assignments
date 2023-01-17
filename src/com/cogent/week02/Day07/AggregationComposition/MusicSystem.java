package com.cogent.week02.Day07.AggregationComposition;

public class MusicSystem {
    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MusicSystem(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public MusicSystem() {
    }
}
