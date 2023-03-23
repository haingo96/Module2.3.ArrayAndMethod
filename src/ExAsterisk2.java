import java.util.Scanner;

public class ExAsterisk2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input row and colum number:");
        int rowColNumber = scn.nextInt();

        double[][] arr = new double[rowColNumber][rowColNumber];

        for (int i = 0; i < rowColNumber; i++) {
            for (int j = 0; j < rowColNumber; j++) {
                System.out.println("Input next element");
                arr[i][j] = scn.nextDouble();
            }
        }

        double sum = 0;
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            sum += arr[i][j];
        }

        System.out.println(sum);
    }
}
