import arithmetic.Addition;
import arithmetic.Subtraction;
import arithmetic.Multiplication;
import arithmetic.Division;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            Addition add = new Addition();
            Subtraction sub = new Subtraction();
            Multiplication mul = new Multiplication();
            Division div = new Division();

            System.out.println("\n--- Arithmetic Operations ---");
            System.out.println("Addition: " + add.add(num1, num2));
            System.out.println("Subtraction: " + sub.subtract(num1, num2));
            System.out.println("Multiplication: " + mul.multiply(num1, num2));
            System.out.println("Division: " + div.divide(num1, num2));

        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values only.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        } 
        finally {
            sc.close();
            System.out.println("\nProgram execution completed.");
        }
    }
}
