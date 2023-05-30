package chapter2;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //promote the user to enter weight in pounds
        System.out.println("enter weight in pounds: ");
        double weight = input.nextDouble();

        //promote the user to enter height in inches
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;// constant
        final double METER_PER_INCH = 0.0254; // constant

        double weightInkilograms = weight*KILOGRAMS_PER_POUND;
        double heightInMeters = height*METER_PER_INCH;

        double bmi =  weightInkilograms/(heightInMeters*heightInMeters);


        //Display result
        System.out.println("BMI is " + bmi);
        if (bmi<18.5)
            System.out.println("underweight");
        else if (bmi<25) {
            System.out.println("Normal");

        }else
            System.out.println("Obese");

    }
}
