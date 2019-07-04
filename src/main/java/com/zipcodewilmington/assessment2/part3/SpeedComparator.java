package com.zipcodewilmington.assessment2.part3;
import java.util.*;

public class SpeedComparator   implements Comparator<Animal>     {

  //  public int SpeedComparator(Animal animal1, Animal animal2) {



  //  }

    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.getSpeed() - o1.getSpeed();
    }

}