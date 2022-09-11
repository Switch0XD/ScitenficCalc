
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter the operator to perform the operation \nif you want to exit then Type 'E' ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/')
            {
                System.out.println("Enter first number ");
                int a = sc.nextInt();
                System.out.println("Enter Second Number");
                int b = sc.nextInt();

                if (op == '+')
                    System.out.println("Sum = "+(a+b));
                else if (op == '-')
                    System.out.println("Subtraction = "+(a-b));
                else if (op == '*')
                    System.out.println("Multiplication = "+(a*b));
                else if (op == '/')
                    if (b == 0)
                        System.out.println("Division = 0");
                    else
                    System.out.println("Division = "+(a/b));
            }
            else if (op == 'E' || op == 'e')
                break;
            else
                System.out.println("Invalid Operator!");
        }
        System.out.println("-----------------------------------");
        System.out.println("Thanks for using this Calculator!");
        System.out.println("-----------------------------------");
    }
}