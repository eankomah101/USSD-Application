package org.eankomah.ussd;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the USSD Code:");
            String userInput = scanner.nextLine();
            if (userInput.equals("*455#")) {
                new Display();
            } else {
                System.out.println("Wrong input. Please try again later.");
            }

        }
        catch (InputMismatchException e){
            System.out.println("Wrong input. Please try again later.");
        }

    }
}