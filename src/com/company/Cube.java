package com.company;

public class Cube extends Side {
    public Cube(int storona, int dlinarebra) {
        super(storona, dlinarebra);
    }

    public int volum() {
        int volum = (int) Math.pow(dlinarebra,3);
        System.out.println(volum);
        return volum;
    }
}