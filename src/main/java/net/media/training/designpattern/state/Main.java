package net.media.training.designpattern.state;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CalculatorContext calculator = new CalculatorContext();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Enter a command: (digit, operator, c, =");
            String command = scanner.next();

            switch (command) {
                case "digit":
                    System.out.println("Enter a digit:");
                    int digit = scanner.nextInt();
                    calculator.inputDigit(digit);
                    break;
                case "operator":
                    System.out.println("Enter an operator (+, -, *, /):");
                    String operator = scanner.next();
                    calculator.inputOperator(operator);
                    break;
                case "c":
                    calculator.clear();
                    break;
                case "=":
                    calculator.calculate();
                    break;

                default:
                    System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}
