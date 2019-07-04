package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    String move;
    String color = "red";
    int speed = 10;
    String migrationMonth;


    public RedRobin() {

    }

    public String color() {

        return color;
    }

    public int getSpeed() {

        return speed;
    }

    public String getMigrationMonth() {

        return migrationMonth;
    }

    public void setMigrationMonth(String mth) {
           migrationMonth = mth;

    }

}