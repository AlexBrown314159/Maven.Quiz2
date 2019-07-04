package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

    List<Integer> myList = new ArrayList();


    public Boolean add(int i) {

        Boolean ans;

        myList.add(i);

        if (myList.contains(i)) {
            return true;
        } else {
            return false;
        }
    }


    public int size() {

        return myList.size();
    }


    public List<Integer> getUnique() {

        myList.add(4);
        myList.add(1);
        myList.add(8);
        myList.add(3);
        myList.add(3);
        myList.add(1);
        myList.add(7);


        sortMyList();


        for (int i = myList.size(); i >= 1; i--) {

            if (myList.get(i) == myList.get(i + 1)) {
                myList.remove(i + 1);
            }
        }

        return myList;
    }


    public void sortMyList() {

  for(int i = 0; i<myList.size()-1;i++)

    {

        for (int k = i + 1; k < myList.size(); k++) {

            if (myList.get(i) > myList.get(k)) {
                Integer tmp = myList.get(i);
                myList.set(i, myList.get(k));
                myList.set(k, tmp);
            }
        }
    }

}





    public String join() {

        String strOut = "";

        myList.add(4);
        myList.add(1);
        myList.add(8);
        myList.add(3);
        myList.add(3);
        myList.add(1);
        myList.add(7);

        for (int i = 0; i < myList.size(); i++) {

          strOut = strOut + myList.get(i).toString();

          if (i < myList.size()) {
              strOut = strOut + ", ";
          }
        }

        return strOut;
    }









    public Integer mostCommon() {

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(8);
        myList.add(9);
        myList.add(3);
        myList.add(3);
        myList.add(3);

        sortMyList();

        Integer myNum = 1;

        Integer[] arr = new Integer[arrMax()];

        for (int i = 1; i < myList.size(); i++) {

           arr[myList.get(i)]++;

        }

        Integer numMax = arr[0];

        for (int i = 1; i < myList.size(); i++) {

           if (arr[i] > numMax) {

            numMax = arr[i];
            myNum = i;

           }
        }

        return myNum;
    }




   public Integer arrMax() {

       Integer min = myList.get(0);
       Integer max = myList.get(0);

       for (int i = 1; i < myList.size(); i++) {

           if (myList.get(i) > max) {
               max = myList.get(i);
           }

           if (myList.get(i) < min) {
               min = myList.get(i);
           }
       }
        return max;
   }




    public Boolean contains(Integer valueToAdd) {


        if (myList.contains(valueToAdd)) {

            return true;
        }
        else {
            return false;
        }

    }
}
