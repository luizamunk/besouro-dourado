package com.besouro;

import com.besouro.model.*;

public class Main {

    public static void main(String[] args) {

        Dog doggo = new Dog(5,"doggo","black");
        Cat brisa = new Cat(2,"brisa","brown");
        doggo.printDog();
        doggo.healthStatus();
        brisa.healthStatus();


    }
}
