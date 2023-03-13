import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result = 0.0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    break;
            }

            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

            scanner.close();
        }
    }
