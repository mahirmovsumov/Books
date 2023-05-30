package chapter1;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //recieve the amount
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount =input.nextDouble();

        int remainingAmount  = (int)(amount*100);


        //find the number of one dollar

        int numberOfOneDollar=remainingAmount/100;
        remainingAmount=remainingAmount%100;

        //find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount/25;
        remainingAmount = remainingAmount/25;

        // find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount/10;
        remainingAmount = remainingAmount%10;

        //find the number if nickels in the remaining amount
        int numberOfNickels =remainingAmount/5;
        remainingAmount=remainingAmount%5;


        //find the number of pennies in the remaining amount
        int numberOfPennies =remainingAmount;


        //display result

        System.out.println("your amount " + amount + " consist of");
        System.out.println(" " + numberOfOneDollar + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " Nickels");
        System.out.println(" " + numberOfPennies + " pennies");



    }

}
