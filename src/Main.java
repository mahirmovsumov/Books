import java.util.LinkedList;

public class Main {

    static int x;
    static final int MY_CONST = 50;
    public static void main(String[] args) {
        System.out.println(x);

        x= 10;
        System.out.println(x);


        Main.x = 88;
        System.out.println(x);
        System.out.println(Main.x);
        System.out.println(MY_CONST);
        System.out.println(Main.MY_CONST);
    }
}
