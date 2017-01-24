package com.besouro.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luiza on 23/01/2017.
 */
public class AnimalHotel{
    List<Animal> animalList;
    String name;

    public AnimalHotel(String hotelName){
        this.animalList = new ArrayList<>();
        this.name = hotelName;
    }

    public void checkAnimalIn(Animal guest){
        this.animalList.add(guest);
        System.out.println(guest.getName() + " just checked in to " + this.name);
    }

    public void checkAnimalOut(String leavingGuestName) {
        for (Animal animal : this.animalList) {
            if (animal.getName() == leavingGuestName) {
                animalList.remove(animal);
                System.out.println(leavingGuestName + " just checked out from " + this.name);
                return;
            }

        }
        System.out.println("There's no " + leavingGuestName);
    }
}
