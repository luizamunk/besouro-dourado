package com.besouro;

import com.besouro.model.Dog;

public class Main {

    public static void main(String[] args) {

        Dog doggo = new Dog(5,"doggo","black");
        Dog brisa = new Dog(2,"brisa","brown");
        doggo.printDog();
        doggo.healthStatus();
        brisa.printDog();


    }
}
