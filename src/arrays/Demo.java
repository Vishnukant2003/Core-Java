package arrays;

import static java.lang.Integer.MAX_VALUE;

public class Demo {
    public static void main(String[] args) {
        int[] arrays = { 1,2,3,4,5,6,7};
        int min = Integer.MAX_VALUE;
        for (int i=0; i< arrays.length ; i++){
            if (arrays[i] <min){
                min = arrays[i];
            }
        }
        System.out.println(min);
    }
}
