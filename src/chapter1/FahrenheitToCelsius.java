package chapter1;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celcius = (5.0/9)*(fahrenheit-32);
        System.out.println("Farenheit " + fahrenheit + " is " + celcius + " in celcius");

    }
}

