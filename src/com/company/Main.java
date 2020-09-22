package com.company;

public class Main {

    public static void main(String[] args) {
      Cube куб=new Cube(5,9);//*dlinarebra*dlinarebra*dlinarebra
      куб.volum();

      Cube куб1=new Cube(12,8);//*dlinarebra*dlinarebra*dlinarebra
      куб1.volum();
      Square квадрат=new Square(3,5);//*storona*storona
      квадрат.aria();
      int volum1=куб.volum();
      int volum2=куб1.volum();
      if(volum1>volum2){
          System.out.println("Cub mai mare decit cub1");
      }
      else{
          System.out.println("Cub1 este mai mare decit cub");
      }

    }
}
