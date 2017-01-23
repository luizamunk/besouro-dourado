package com.besouro.model;

/**
 * Created by Luiza on 22/01/2017.
 */
public class Dog extends Animal {

    public Dog(int dogAge, String dogName, String  dogFurColor){
        super(dogAge,dogName,dogFurColor,"dog");
    }

    public void healthStatus(){

        System.out.println("Your dog is healthy!!");
    }
}
