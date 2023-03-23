import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        String[] input = {"1", "2", "3", "4", "5"};

        Scanner scn = new Scanner(System.in);
        System.out.println("Input student:");
        String toCheckString = scn.nextLine();

        for (int i = 0; i < input.length; i++) {
            if (toCheckString.equals(input[i])) {
                System.out.println(i);
            }
            if (toCheckString.equals(input[i]) && i == input.length - 1) {
                System.out.println("No such student");
            }
        }
    }
}
