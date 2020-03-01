/*
Write a java program that takes a number as input and prints its multiplication
table upto 10. Display the product of two numbers
*/




import java.util.Scanner;

public class Hey {


    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );


        //int a = 8;
       // System.out.println( "Enter the first number: " + a  );

        System.out.println("Enter the number: ");
          int m = input.nextInt();
         int i = 0;

         for(i = 0; i < 10; i++  ){
// in the s.o.t I make it clear for the user which number multiply with which gives this
                System.out.println( m + "x" + i + "=" +  m * (i));
         }

         System.out.println( "....The end......" );

        // System.out.println( m*i );


    }

}
