package com.besouro.model;

/**
 * Created by vonbarbarosa on 22/01/17.
 */
public class Cat extends Animal {

    private int age;
    private String name;
    private String furColor;

    public Cat(int catAge, String catName, String catFurColor) {
        this.age = catAge;
        this.name = catName;
        this.furColor = catFurColor;
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
}
