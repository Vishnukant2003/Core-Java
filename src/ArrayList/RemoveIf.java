package ArrayList;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[]args){
        ArrayList arrayList= new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);

        //remove odd value in given array
        //remove elements based on condition

        Predicate<Integer> evenTest = x -> x % 2 == 0;

        arrayList.removeIf(evenTest);
         System.out.println("after deleting the elements" +arrayList);


         

    }
}
