package calcpack;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
*  Phil Fernandez
*/

public class Calculator {
    public static void main(String[] args) {
        float operand1 = 0, operand2 = 0;
        int choice;
        Scanner in = new Scanner(System.in);

        // do calculations until user makes choice 5 to exit
        do {
            // prompt user for choice
            System.out.println("(1) Addition");
            System.out.println("(2) Subtraction");
            System.out.println("(3) Multiplication");
            System.out.println("(4) Division");
            System.out.println("(5) Exit");
            System.out.print("\nEnter Your Choice : ");
            choice = in.nextInt();

            // if choice is valid prompt user for operands and then catch potential InputMismatchException
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                try {
                    System.out.print("Enter two numbers : ");
                    operand1 = in.nextFloat();
                    operand2 = in.nextFloat();

                } catch(InputMismatchException e) {
                    System.out.println("Non-Digit character detected : Program will terminate");
                    System.exit(1);
                }
            }

            // Display correct choice, or error message if invalid choice was given
            switch(choice) {
                case 1: // addition
                    System.out.printf("\n%.2f + %.2f = %.2f\n\n", operand1, operand2, operand1+operand2);
                    break;
                case 2: // subtraction
                    System.out.printf("\n%.2f - %.2f = %.2f\n\n", operand1, operand2, operand1-operand2);
                    break;
                case 3: // multiplication
                    System.out.printf("\n%.2f * %.2f = %.2f\n\n", operand1, operand2, operand1*operand2);
                    break;
                case 4: // division
                    System.out.printf("\n%.2f / %.2f = %.2f\n\n", operand1, operand2, operand1/operand2);
                    break;
                case 5: // exit
                    System.out.println("Goodbye...");
                    System.exit(0);
                default: // bad choice
                    System.out.println("Make a valid choice (1 - 5)\n");
            }
        } while(choice != 5);

        in.close();
    }
}
