package Collection;

import java.util.ArrayList;

public class Demo4_deletion {
    public static void main(String[]args){
        ArrayList arrayList= new ArrayList();
        arrayList.add("string");
        arrayList.add("string1");
        arrayList.add("string2");
        arrayList.add("string3");
        arrayList.add("string4");
        arrayList.add("string5");

        System.out.println("add elements in array" +arrayList);
        // 01.remove "string"
        arrayList.remove("string");
        System.out.println("remove string named element from the list" + arrayList);

        //02.remove specific element in arrayList


        arrayList.remove(0);
        System.out.println("remove all the method's " + arrayList);

        arrayList.removeLast();
        System.out.println("last element of array " +arrayList);

        ArrayList subList = new ArrayList();

        subList.add(100);
        subList.add(200);
        System.out.println(subList);

        subList.removeAll(subList);
        System.out.println(subList);

        arrayList.add("X");
        arrayList.add("Y");
        arrayList.add("Z");
        System.out.println(arrayList);

        ArrayList removeSpe = new ArrayList();
        removeSpe.add("X");
//        System
        arrayList.retainAll(removeSpe);
        System.out.println("remove all other elements in " + arrayList);


//        ArrayList removeList = new ArrayList();

    }
}
