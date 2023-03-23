public class Practice1 {
    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] temp = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            temp[i] = input[input.length - 1 - i];
        }

        input = temp;

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}