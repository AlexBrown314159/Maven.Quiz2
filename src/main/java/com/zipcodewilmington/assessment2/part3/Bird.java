package com.zipcodewilmington.assessment2.part3;

public abstract class Bird implements Animal {

        String move = "fly";
        String migrationMonth;

    public String move() {

        return move;
    }


    public void setMigrationMonth(String expected) {
        migrationMonth = expected;
    }


    public String getMigrationMonth() {
        return null;
    }

}
