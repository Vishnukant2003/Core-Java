package Collection;

import java.util.ArrayList;

public class Demo3_Insertion {
    public static void main(String[]args){
        ArrayList arrayList = new ArrayList();
        System.out.println("When list is created" + arrayList);


        arrayList.add(106);
        System.out.println("when single elemnet is inserted"+ arrayList);


        arrayList.add(0,204);
        System.out.println("when single element is addded at the starting of the list" + arrayList);

        ArrayList subList = new ArrayList();
        subList.add(1);
        subList.add(2);
        subList.add(3);
        arrayList.addAll(subList);
        System.out.println(arrayList);

        arrayList.addAll(0,subList);
        System.out.println("when  list of element at a specific index "+ arrayList);

//        arrayList.add(105);
//
//        arrayList.add(205);
//        arrayList.add("vish");
//        arrayList.add("abd");
//        arrayList.add("abc");
    }
}
