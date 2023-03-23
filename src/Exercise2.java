import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        boolean isInRange = false;
        int pos;

        Scanner scn = new Scanner(System.in);
        System.out.println("Input value you wanna insert");
        int value = scn.nextInt();
        do {
            System.out.println("Input position you wanna insert");
            pos = scn.nextInt();
            if (pos < arr.length && pos >= 0) {
                isInRange = true;
            }else {
                System.out.println("Cannot insert into this position");
            }
        }while (!isInRange);

        for (int i = arr.length - 1; i > pos; i--) arr[i] = arr[i - 1];
        arr[pos] = value;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
