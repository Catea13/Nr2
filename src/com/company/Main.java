package com.company;

public class Main {

    public static void main(String[] args) {
      Куб куб=new Куб(5,9);//*dlinarebra*dlinarebra*dlinarebra
      куб.volum();

      Куб куб1=new Куб(12,8);//*dlinarebra*dlinarebra*dlinarebra
      куб1.volum();
      Квадрат квадрат=new Квадрат(3,5);//*storona*storona
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
