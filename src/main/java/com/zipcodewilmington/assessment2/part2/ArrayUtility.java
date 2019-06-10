package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {

    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer myLen = array1.length + array2.length;

        Integer[] myArr = new Integer[myLen];

        Integer iCount = 0;
        for (Integer i = 0; i < array1.length; i++) {
            myArr[iCount] = array1[i];
            iCount++;
        }

        for (Integer i = 0; i < array2.length; i++) {
            myArr[iCount] = array2[i];
            iCount++;
        }
        System.out.println(myLen);
        return myArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        Integer[] myArr = new Integer[array.length];

        Integer iCount = 0;
        for (Integer i = index; i < array.length; i++) {
            myArr[iCount] = array[i];
            iCount++;
        }

        for (Integer i = 0; i < index; i++) {
            myArr[iCount] = array[i];
            iCount++;
        }

        return myArr;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer myAns = 0;

        for (Integer i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                myAns++;
            }
        }


        for (Integer i = 0; i < array2.length; i++) {
            if (array2[i] == valueToEvaluate) {
                myAns++;
            }
        }

        return myAns;
    }

    public Integer mostCommon(Integer[] array) {

        Integer myAns = 0;
        Integer iBest = 0;
        Integer iMax = 0;

        for (Integer i = 0; i < array.length; i++) {

            for (Integer j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    iMax++;
                    if (iMax > iBest) {
                        iBest = iMax;
                        myAns = array[j];
                    }
                }
                iMax = 0;
            }
        }

        return myAns;
    }
}
