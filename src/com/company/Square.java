package com.company;

public class Square extends Side {


    public Square(int storona, int dlinarebra) {
        super(storona, dlinarebra);
    }

    public void aria(){
        int aria= (int) Math.pow(storona,2);
        System.out.println(aria);

    }
}
