import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        int index = 0;
        boolean isInArr = false;

        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Input value you wanna check:");
            int inputValue = scn.nextInt();
            for (short i = 0; i < arr.length; i++) {
                if (inputValue == arr[i]) {
                    index = i;
                    isInArr = true;
                    break;
                }
            }
        }while (!isInArr);

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
