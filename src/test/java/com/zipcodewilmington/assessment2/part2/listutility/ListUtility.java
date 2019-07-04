package com.zipcodewilmington.assessment2.part2.listutility;

import java.util.ArrayList;
import java.util.List;


public class ListUtility {

    public Boolean add(int i) {

        Boolean ans = false;

        List myList = new ArrayList();
        Integer n0 = myList.size();

        myList.add(i);

        //     Integer n1 = List.size();

        if (myList.size() > 0) {
            ans = true;
        }

        return ans;
    }



    public Integer size() {



        return null;
    }

    public List<Integer> getUnique() {


        return null;
    }

    public String join() {


        return null;
    }

    public Integer mostCommon() {


        return null;
    }

    public Boolean contains(Integer valueToAdd) {


        return null;
    }
}


