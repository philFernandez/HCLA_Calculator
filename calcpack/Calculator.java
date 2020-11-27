package calcpack;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float a, b, res;
        char select, choice;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("(1) Addition\n");
            System.out.print("(2) Subtraction\n");
            System.out.print("(3) Multiplication\n");
            System.out.print("(4) Division\n");
            System.out.print("(5) Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = in.next().charAt(0);
            switch(choice) {
                case '1':
                    System.out.print("Enter two numbers : ");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    System.out.printf("\n%.2f + %.2f = %.2f\n\n", a, b, a+b);
                    break;
                case '2':
                    System.out.print("Enter two numbers : ");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    System.out.printf("\n%.2f - %.2f = %.2f\n\n", a, b, a-b);
                    break;
                case '3':
                    System.out.print("Enter two numbers : ");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    System.out.printf("\n%.2f * %.2f = %.2f\n\n", a, b, a*b);
                    break;
                case '4':
                    System.out.print("Enter two numbers : ");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    System.out.printf("\n%.2f / %.2f = %.2f\n\n", a, b, a/b);
                    break;
                case '5':
                    System.out.println("Goodbye...");
                    System.exit(0);
                default:
                    System.out.println("Make a valid choice (1 - 5)\n");
            }
        } while(choice != '5');

        in.close();

    }
}
