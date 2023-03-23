import java.util.Scanner;

public class ExAsterisk1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input row number");
        int row = scn.nextInt();
        System.out.println("Input colum number");
        int col = scn.nextInt();

        double[][] arr = new double[row][];
        for (int i = 0; i < row; i++) {
            arr[i] = new double[col];
        }

//        for (double[] line : arr) {
//            for (double element : line) {
//                System.out.println("Input next element");
//                element = scn.nextDouble();
//            }
//        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Input next element:");
                arr[i][j] = scn.nextDouble();
            }
        }

        System.out.println("Input colum you wanna sum");
        int colToSum = scn.nextInt();

        double sum = 0;

        for (double[] arrRow : arr) {
            sum += arrRow[colToSum];
        }
        System.out.println(sum);
    }
}
