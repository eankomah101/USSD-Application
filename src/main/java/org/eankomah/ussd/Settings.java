package org.eankomah.ussd;

import java.util.Scanner;

public class Settings {
    private String name;
    private String password;

    private final Scanner scanner = new Scanner(System.in);

    public Settings(String name, String password) {
        this.name = name;
        this.password = password;

        mainDisplay();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public void mainDisplay() {
        System.out.println();
        System.out.println("*******************************");
        System.out.println("-----------Settings------------");
        System.out.println("*******************************");
        System.out.println("      1. Change Name          *");
        System.out.println("      2. Change Password      *");
        System.out.println("      00. Go back              *");
        System.out.print("   Please enter your choice:  ");
        int choice = scanner.nextInt();
        System.out.println("*******************************");
        switch (choice) {
            case 1:
                changeName();
                break;
            case 2:
                changePassword();
                break;
            case 0:
                mainDisplay();
                break;
            default:

        }

    }

    public void changeName() {
        System.out.println("Please enter the new name: ");
        scanner.nextLine();
        String newName = scanner.nextLine();
        setName(newName);
        confirmationMessage();
    }

    public void changePassword() {
        System.out.println("Please enter the new password: ");
        scanner.nextLine();
        String newPassword = scanner.nextLine();
        setPassword(newPassword);
        confirmationMessage();
    }

    public void confirmationMessage() {
        System.out.println();
        System.out.println("Are you sure you want to make changes");
        System.out.println("1. Yes.");
        System.out.println("2. Cancel.");
        System.out.println("00. Go back.");
        int choice2 = scanner.nextInt();

        switch (choice2) {
            case 1:
                System.out.println("Congratulations! Details saved successfully");
                break;
            case 2:
                System.out.println("Sad, you decided not to make any changes");
                break;
            case 0:
                mainDisplay();
                break;
            default:
                System.out.println("Wrong Input");

        }

    }
}
