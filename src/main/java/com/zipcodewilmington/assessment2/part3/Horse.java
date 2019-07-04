package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal {

        String move = "gallop";
        String color = "brown";
        int speed = 40;

    public Horse() {
    }

    public String move() {
        return move;
    }

    public String color() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }


}
