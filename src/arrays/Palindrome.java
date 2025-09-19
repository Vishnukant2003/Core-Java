package arrays;

public class Palindrome {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,30,20,10 };
        boolean isPalindrome = true;
        int left= 0, right=array.length-1;
        while (left<right){

            int tem= array[left];
            array[left]=array[right];
            array[right] =tem;
            if (array[left] != array[right]){
                isPalindrome = false;
                break;
            }
            left++;
            right--;

        }
        System.out.println(isPalindrome ? "isPalindrome":"This is not a palindrome");
    }
}
