package Collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo5_removeIf {
    public static void main(String[]args){
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("array of " + arrayList);

        Predicate<Integer> removeEven = x-> x % 2 == 0;

        arrayList.removeIf(removeEven);

        System.out.println("after deletion" + arrayList);
//it's  optional for the printing of an array's
        Object[] array = arrayList.toArray();
    }
}
