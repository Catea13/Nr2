package com.company;

public class Куб  extends Сторона {
    public Куб(int storona, int dlinarebra) {
        super(storona, dlinarebra);
    }

    public int volum() {
        int volum = dlinarebra * dlinarebra * dlinarebra;
        System.out.println(volum);
        return volum;
    }
}