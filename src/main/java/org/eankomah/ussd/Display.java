package org.eankomah.ussd;

import java.util.Scanner;

public class Display {
    private final Scanner scanner = new Scanner(System.in);
    public Display() {
        mainDisplay();
    }
    public  void mainDisplay()   {
        System.out.println("**************************");
        System.out.println("--------USSD--------------");
        System.out.println("**************************");
        System.out.println(" *    1. Airtime / Data  *");
        System.out.println(" *     2. Cash           *");
        System.out.println(" *     3. Settings       *");
        System.out.print(" Please enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("***************************");
        System.out.println();


        switch (choice) {
            case 1:
                airtime_data_display();
                break;
            case 2:
                cash();
                break;
            case 3:
                new Settings("admin", "password");

                break;
            default:
                System.out.println("Wrong input, please try again later!");
                break;
        }

    }

    private void airtime_data_display()   {
        System.out.println();
        System.out.println("***************************");
        System.out.println("------Airtime / Data-------");
        System.out.println("***************************");
        System.out.println("*      1. Airtime         *");
        System.out.println("*      2. Data            *");
        System.out.println("*      00. Go back         *");
        System.out.print("   Please enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("***************************");
        System.out.println();

        switch (choice) {
            case 1:
                new Airtime();
                break;
            case 2:
                new Data();
                break;
            case 0:
                mainDisplay();
                break;
            default:
                System.out.println("Wrong input, please try again later");
                break;
        }

    }

    private void cash()   {
        System.out.println();
        System.out.println("*************************");
        System.out.println("----------Cash------------");
        System.out.println("*************************");
        System.out.println("*    1. Make payment    *");
        System.out.println("*    2. Receive funds   *");
        System.out.println("*    3. View transfers  *");
        System.out.println("     00. Go back        *");
        System.out.print(" Please enter your choice: ");
    }


}
