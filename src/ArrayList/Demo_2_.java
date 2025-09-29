package ArrayList;

import java.util.ArrayList;

public class Demo_2_ {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);

        //remove perticular element
        arrayList.remove(0);
        System.out.println("after deletion the 40"+arrayList);

        ArrayList subList = new ArrayList();
        subList.add(1);
        subList.add(2);
        subList.add(3);
        subList.add("abc");

        arrayList.addAll(0,subList);

        System.out.println("adding subarray in existing arrays" + arrayList);


        //
        arrayList.retainAll(subList);
        System.out.println("remove sublist from the main arrays"+arrayList);



        ArrayList tempArray = new ArrayList();
        tempArray.add("a");
        tempArray.add("b");
        tempArray.add("c");
        tempArray.add("d");
        arrayList.addAll(tempArray);
        System.out.println("adding new array :: " +arrayList);

        //remove all
//        arrayList.removeAll(arrayList);
        System.out.println(arrayList);


        //remove all the arrays elements
        arrayList.clear();
        System.out.println("remove all elements from  the main array "+arrayList);
    }
}
