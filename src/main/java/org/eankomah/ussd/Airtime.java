package org.eankomah.ussd;

import java.util.Scanner;


public class Airtime {
    
    private final Scanner scanner = new Scanner(System.in);
    
    
    public Airtime(){
        mainDisplay();
    }

    private void mainDisplay() {
        System.out.println();
        System.out.println("********************************");
        System.out.println("--------Buy Airtime-------------");
        System.out.println("********************************");
        System.out.println("* 1. Buy airtime for yourself. *");
        System.out.println("* 2. Buy airtime for someone.  *");
        System.out.println("* 00. Go back.                  *");
        System.out.print("   Please enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("*********************************");

        switch (choice){
            case 1:
                enterAmount();
                break;
            case 2:
                buyAirtimeForSomeone();
                break;
            case 0:
                new Display();
                break;
            default:
                System.out.println("Wrong Input");

        }
    }

    public void enterAmount(){

        System.out.println();
        System.out.println("   Please enter the amount to buy      *");
        System.out.println("               OR                      *");
        System.out.println("          Enter 0 to Go back           *");
        int input = scanner.nextInt();


        if(input == 0){
            mainDisplay();
        }else {
            confirmationMessage(input);
        }


    }

    public void buyAirtimeForSomeone(){
        System.out.println();
        System.out.print("Enter the recipient number: ");
        scanner.nextInt();

        enterAmount();
    }

    public void confirmationMessage(int input){
        System.out.println();
        System.out.println("Are you sure you want to buy.");
        System.out.println("1. Yes.");
        System.out.println("2. Cancel.");
        System.out.println("00. Go back.");

        int choice2 = scanner.nextInt();

        switch(choice2) {
            case 1:
                System.out.println("Congratulations! You just purchased worth GHC " + input + " of airtime.");
                break;
            case 2:
                System.out.println("Sad, you decided not to purchase anymore.");
                break;
            case 0:
                enterAmount();
                break;
            default:
                break;

        }
    }




}
