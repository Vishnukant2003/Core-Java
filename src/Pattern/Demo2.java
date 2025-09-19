package Pattern;

public class Demo2 {

    public static void main(String[] args) {
//       int rows = 5;
       for(int row=1; row<=5; row++){
           for (int space= 1; space<=5-row; space++){
               System.out.print(" ");
           }
           for (int col=1; col<=row; col++){
               System.out.print("*");
           }
           System.out.println(" ");
       }
    }
}
