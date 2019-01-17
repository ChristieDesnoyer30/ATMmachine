package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double userBalance = 553.23;
        int userChoice;

	/*Create a program to run an ATM machine
    Your program should give the user the option to check account balance, withdraw funds, and deposit funds.
    Your program should allow the user to take additional actions until they choose to exit the program.
    Your program should include error handling for bad input
    (e.g., what happens if the user tries to withdraw more money than they have in their account?).*/

	System.out.println("Welcome to the ATM. \n What would you like to do? \n Press 1 for Account Balance  \n Press 2 to Withdraw Funds \n Press 3 to Deposit Funds.");

	Scanner scan = new Scanner (System.in);
	userChoice =scan.nextInt();

	if (userChoice == 1){

	    System.out.println("Your balance is " + userBalance);

    } else if (userChoice == 2){

	    System.out.println("How much would you like to withdraw?");

	    int withdrawAmount=scan.nextInt();
	    do {

	    	System.out.println("NOT ENOUGH FUNDS. Enter a new amount.");

			withdrawAmount=scan.nextInt();

		} while (withdrawAmount > userBalance);

	    double newBalance = userBalance - withdrawAmount;


		System.out.println(" Transaction approved. You are withdrawing: " + withdrawAmount);
	    System.out.println("Your new balance is " + newBalance);

    }
	else if (userChoice == 3){

		System.out.println("Enter an amount to be deposited");
		
		int depositAmount = scan.nextInt();

		double newBalance = depositAmount + userBalance;

		System.out.println("Transaction approved. \n Your new balance is " + newBalance);

	}



    }
}
