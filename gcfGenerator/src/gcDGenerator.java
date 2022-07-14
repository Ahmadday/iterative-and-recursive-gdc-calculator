import java.util.Random;
import java.util.*;
// a java program to calculate the greatest common factor of two random numbers
//created 2/17/22 by Ahmad Day

public class gcDGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int num1 = r.nextInt(1000);
        int num2 = r.nextInt(1000);
        System.out.println(" you have the numbers " + num1 + " as well as " + num2);
        System.out.println(" whould you like to  use recursion to solve this?");
        System.out.println("Use R for recursion and I for iteration(use caps!): ");
        String choice = in.nextLine();

        if (choice.equals("R")) {
            System.out.println("starting recursion ");
            int fin = recursionGCF(num1, num2);
            // calling the  recursive function and assigning the final product to the variable
            System.out.println("done! The answer is: "+fin);

        }
        if ((choice.equals("I"))) {
            System.out.println("starting iteration ");
            int fin =iterativeGCF(num1, num2);
            // calling the  recursive function and assigning the final product to the variable
            System.out.println("done! The answer is: "+fin);

        }

    }

    public static int recursionGCF(int num1, int num2) {
        if (num2 == 0)
            return num1;
        else
        return recursionGCF( num2,(num1 % num2) );
        // mod is the integer remainder function
    }  // gcd()

    public static int iterativeGCF(int num1, int num2)
    {
        while (num1 != num2)
        {
            if (num1 > num2){
            num1 = num1 - num2;
            }
        else{
            num2 = num2 - num1;
                }
         } //end while
        return num1;
    } // end gcd()

    }// ends class


