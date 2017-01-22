package com.besouro.model;

/**
 * Created by Luiza on 22/01/2017.
 */
public class Dog {

    private int age;
    private String name;
    private String furColor;

    public Dog(int dogAge, String dogName, String  dogFurColor){

        this.age = dogAge;
        this.name = dogName;
        this.furColor = dogFurColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void printDog(){

        System.out.println(this.name + " is a beautiful " + this.furColor + " dog, which is " + this.age + " years old");
    }
}
