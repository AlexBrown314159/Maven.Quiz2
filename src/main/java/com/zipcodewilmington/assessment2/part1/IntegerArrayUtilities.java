package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {

        Integer i = array.length;

        if ((i % 2) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public Integer[] range(int start, int stop) {

        Integer myLen = stop - start + 1;

        Integer[] myArray = new Integer[myLen];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + start;
        }

        return myArray;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        Integer mySum = array[0] + array[1];

        return mySum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        Integer myProd = array[array.length - 2] * array[array.length - 1];

        return myProd;
    }
}
