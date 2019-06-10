package com.zipcodewilmington.assessment2.part3;

public class SpeedComparator {

    public int SpeedComparator(Animal animal1, Animal animal2) {

    if (animal1.speed == animal2.speed) {
        return 0;
    }

        if (animal1.speed > animal2.speed) {
            return -1;
        }


        if (animal1.speed < animal2.speed) {
            return 1;
        }



}