package arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] array ={12,134,44,23,53,35,36,356,62,26,456};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i= 0; i<array.length; i++){
            if (array[i]>max){
                secMax = max;
                max = array[i];
            }
            if (array[i]<max ){
                array[i] = secMax;
            }
        }
        System.out.println("First max Value "+ max);
        System.out.println("second Max value" +secMax);
    }
}
