import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        short size;
        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Input size:");
            size = scn.nextShort();
        }while (size > 20);

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Input next element value:");
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
