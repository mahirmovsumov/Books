package chapter1;
import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        int minute = seconds/60;
        int remainingSeconds = seconds%60;
        System.out.println(seconds  + " seconds is " + minute + " minute and " + remainingSeconds + " seconds");
    }
}
