package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    public WuTangConcatenator(Integer input) {
        Integer myI = input;

    }

    public Boolean isWu() {
        // 3
/*
        if (myI <= 3) {
            return false;
        }

        if ((input % 3) != 0) {
            return false;
        }
*/
        return null;
    }



    public Boolean isTang() {
        // 5
/*
        if (myI <= 5) {
            return false;
        }

        if ((input % 5) != 0) {
            return false;
        }
*/
        return true;
    }



    public Boolean isWuTang() {
        // 3 and 5
/*
        if (myI <= 15) {
            return false;
        }

        if ((input % 15) != 0) {
            return false;
        }
*/
        return true;
    }
}
