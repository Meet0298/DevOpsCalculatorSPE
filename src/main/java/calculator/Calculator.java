package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public double factorial(double n) {
        if (n < 0) {
            logger.info("Factorial of negative number is not possible!");
            return Double.NaN;
        }

        else {
            double result = 1;

            for (int i = 1; i <= n; i++)
                result = result * i;

            logger.info("Factorial of the number : " + n + "\n Result is : " + result);
            return result;
        }
    }

    public double naturalLog(double n) {
        logger.info("Natural Logarithm of : " + n + "\n Result is : " + Math.log(n));
        return Math.log(n);
    }

    public double square_root(double n) {
        logger.info("The Square Root of : " + n + "\n Result : " + Math.sqrt(n));
        return Math.sqrt(n);
    }

    public double power(double n1, double n2) {
        logger.info("The power of : " + n1 + " raised to " + n2 + "\n Result is : " + Math.pow(n1, n2));
        return Math.pow(n1, n2);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double n1, n2;

        do {
            System.out.println("Operations");
            System.out.print("\n------------------\n");
            System.out.println("1) Square Root");
            System.out.println("2) Factorial");
            System.out.println("3) Natural Logarithm");
            System.out.println("4) Power");
            System.out.println("-) Enter any number to exit");

            System.out.print("Enter your choice : ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter a number : ");
                    n1 = scanner.nextDouble();
                    System.out.println("Square root of " + n1 + " is : " + calculator.square_root(n1));
                    System.out.println("\n");

                    break;

                case 2:
                    System.out.print("Enter a number : ");
                    n1 = scanner.nextDouble();
                    System.out.println("The factorial of " + n1 + " is : " + calculator.factorial(n1));
                    System.out.println("\n");

                    break;
                case 3:

                    System.out.print("Enter a number : ");
                    n1 = scanner.nextDouble();
                    System.out.println("The natural log of " + n1 + " is : " + calculator.naturalLog(n1));
                    System.out.println("\n");

                    break;

                case 4:

                    System.out.print("Enter the first number : ");
                    n1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = scanner.nextDouble();
                    System.out.println("Result is : " + calculator.power(n1, n2));
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Quit");
                    return;
            }
        } while (true);
    }

}
