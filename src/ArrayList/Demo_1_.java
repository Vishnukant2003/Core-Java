package ArrayList;

import java.util.ArrayList;

public class Demo_1_ {
     public static void main(String[]args){
         ArrayList arrayList = new ArrayList();
         arrayList.add(100);
         System.out.println(arrayList.toString());
         arrayList.add(0,200);
         System.out.println(arrayList);

         ArrayList listElement = new ArrayList();
         listElement.add(101);
         listElement.add(102);
         listElement.add(103);
         listElement.add(104);
         arrayList.addAll(listElement);
         System.out.println(arrayList);

         arrayList.addAll(0,listElement);
         System.out.println("Adding at the specific index :: "+arrayList);
     }
}
