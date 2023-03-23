import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");

        Scanner scn = new Scanner(System.in);
        System.out.println("Input your choice:");
        short choice = scn.nextShort();

        switch (choice) {
            case 1 -> {
                System.out.println("Input your Fahrenheit:");
                double fahrenheit = scn.nextDouble();
                System.out.println((5.0 / 9) * (fahrenheit - 32));
            }
            case 2 -> {
                System.out.println("Input your Celsius:");
                double celsius = scn.nextDouble();
                System.out.println(celsius * 9 / 5 + 32);
            }
            case 0 -> System.out.println("Ended");
        }
    }
}
