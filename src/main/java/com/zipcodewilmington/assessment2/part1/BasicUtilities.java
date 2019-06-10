package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {

    public Boolean isGreaterThan5(Integer value) {

        if (value >= 5) {
            return true;
        }

        return false;
    }

    public Boolean isLessThan7(Integer value) {

        if (value <= 7) {
            return true;
        }

        return false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {

        if ((valueToEvaluate >= 5) && (valueToEvaluate <= 7)) {
            return true;
        }

        return false;
    }

    public Boolean startsWith(String string, Character character) {

            String myStr = string.toLowerCase();
            myStr = myStr.substring(0, 1);

            String myChar = character.toString();
            myChar = myChar.toLowerCase();
            myChar = myChar.substring(0, 1);

            char c1 = myStr.charAt(0);
            char c2 = myChar.charAt(0);

            System.out.println(c1 + "   " + c2);

            if (myStr.equals(myChar)) {
                return true;
            }

        return false;
    }
}
