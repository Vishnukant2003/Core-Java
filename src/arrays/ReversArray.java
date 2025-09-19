package arrays;

public class ReversArray {
    public static void main(String[] args) {
        int [] array = { 10,20,30,40,50};
//        int right = array.length-1;
        int left = 0,right=array.length -1;
        while (left < right){
            int tem = array[left];
            array[left]= array[right];
            array[right]=tem;
            left ++;
            right --;
        }

        for (int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
