package com.besouro.model;

/**
 * Created by Luiza on 22/01/2017.
 */
public class Animal {
    protected int age;
    protected String name;
    protected String furColor;

    public Animal(int animalAge, String animalName, String animalFurColor) {
        this.age = animalAge;
        this.name = animalName;
        this.furColor = animalFurColor;
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

    public void healthStatus(){
        System.out.println("Your animal is healthy!");

    }
}
