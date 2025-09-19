package arrays;

public class MAX_VALUE {
    public static void main(String[] args) {
        int [] array = { 1,200,3,64,5,6,45};
        int max = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++){
            if (array[i]>max){
                max = array[i];

            }
        }
        System.out.print(max);
    }
}
