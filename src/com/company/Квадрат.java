package com.company;

public class Квадрат extends Сторона {


    public Квадрат(int storona, int dlinarebra) {
        super(storona, dlinarebra);
    }

    public void aria(){
        int aria=storona*storona;
        System.out.println(aria);

    }
}
