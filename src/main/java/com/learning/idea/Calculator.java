package com.learning.idea;

import java.util.Scanner;

import static com.learning.idea.util.MathMethods.*;

public class Calculator {
    public static void main(String[] args) {
        String numeric1 = getInput("Enter a numeric value: ");
        String numeric2 = getInput("Enter a numeric value: ");
        String operation = getInput("Choose an operation (+ - * /):");

        double result;

        try {
            switch (operation) {
                case "+":
                    result = addValues(numeric1, numeric2);
                    break;
                case "-":
                    result = subtractValues(numeric1, numeric2);
                    break;
                case "*":
                    result = multiplyValues(numeric1, numeric2);
                    break;
                case "/":
                    result = divideValues(numeric1, numeric2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            printOutput(result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static void printOutput(double result) {
        System.out.println("The answer is " + result);
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
