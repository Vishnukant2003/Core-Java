package Collection;

import java.util.ArrayList;

public class Demo2 {
    public static void main (String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(106);
        arrayList.add(204);
        arrayList.add(105);
        arrayList.add(205);
        arrayList.add("vish");
        arrayList.add("abd");
        arrayList.add("abc");
        System.out.println(arrayList.toString());
        System.out.println("size of the arraylist " + arrayList.size());
        System.out.println("array list contains abc  " + arrayList.contains("abc"));
        System.out.println("array list isEmpty  " + arrayList.isEmpty());

    }
}
