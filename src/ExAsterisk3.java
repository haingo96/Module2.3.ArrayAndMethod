import java.util.Scanner;

public class ExAsterisk3 {
    public static void main(String[] args) {
        short cnt = 0;
        String initialString = "Hello World";

        Scanner scn = new Scanner(System.in);
        System.out.println("Input char you wanna check");
        char input = scn.next().charAt(0);

        char[] initToChar = initialString.toCharArray();

        for (char chrtr : initToChar) {
            if (chrtr == input){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
