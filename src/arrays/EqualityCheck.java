package arrays;

public class EqualityCheck {
    public static void main(String[] args) {
        int[] array1={10,20,30,40,50};
        int[] array2={10,20,30,40,50};
        System.out.println(equals(array1,array2));

    }
    public static boolean equals (int[] array1 ,int[] array2){
        if (array1 == null || array2 == null){
            return false;
        }
        if (array1.length != array2.length){
            return false;
        }

        for (int i= 0; i<array1.length; i++){
            if (array1[i]!=array2[i]){
                return false;
//            System.out.print(i);
            }

        }
        return true;

    }
 }
