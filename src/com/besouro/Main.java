package com.besouro;

import com.besouro.model.*;

public class Main {

    public static void main(String[] args) {

        Dog doggo = new Dog(5,"doggo","black");
        Cat brisa = new Cat(2,"brisa","brown");

        AnimalHotel hotel = new AnimalHotel("Casa da Lu");
        hotel.checkAnimalIn(doggo);
        hotel.checkAnimalIn(brisa);

        hotel.checkAnimalOut("Leo");
        hotel.checkAnimalOut("brisa");
        hotel.checkAnimalOut("Brisa");
        hotel.checkAnimalOut("doggo");


    }
}
