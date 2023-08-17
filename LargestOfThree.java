// Makala Ramos Yang
/* LargestOfThree.java

8/17/23

input: three ints from user
processing: find the largest of the three ints with decision structure
output: the largest of the three ints, the sum of three ints
 */

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        System.out.print("\n Welcome to my Largest of Three program!!!!\n\n");

        //Variable declaration
        String userName;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;
        //create scanner
        Scanner scanner = new Scanner(System.in);

//prompt user for username
        System.out.println("\n Please enter your name!:");
        //store userName into the variable named 'userName'

        userName = scanner.nextLine();

        //output username
        System.out.println("\n Username is:" + userName);

        //Get the three ints from the user
        //Prompt for the first int
        System.out.println("\nEnter Your First Number!:");
        num1 = scanner.nextInt();
        //output num 1

        System.out.println("\n You entered: " + num1 + " for your first number!\n");

        //Prompt for the second int
        System.out.println("\nEnter Your Second Number!:");
        num2 = scanner.nextInt();
        //output num 2

        System.out.println("\n You entered: " + num2 + " for your second number!\n");

        //Prompt for the third int
        System.out.println("\nEnter Your Third Number!:");
        num3 = scanner.nextInt();
        //output num 3

        System.out.println("\n You entered: " + num3 + " for your third number!\n");

        System.out.println("\n You entered: " + num1 + " , " + num2 + " ,and " + num3);

        //find the largest

        if (num1 > num2 & num1 > num3){
            largest = num1;
        }
        if (num2 > num1 & num2 > num3){
            largest = num2;
        }
        if (num3 > num1 & num3 > num2){
            largest = num3;
        }
        // output the largest number
        System.out.println("\n***********\n The largest of: " + num1 + " , " + num2 + " ,and " +num3 + " is: " + largest + "!");

    }
}