package com.cogent.week01.day05;

public class GarbageCollection {

    int objId;

    public GarbageCollection(int objId) {
        this.objId = objId;
        System.out.println("Craeted: " + objId);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 250; i++) {
            new GarbageCollection(i);
        }

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized " + objId);
    }
}
