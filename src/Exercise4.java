public class Exercise4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 8, 5, 4, 7,},
                {11, 3, 9, 2, 5},
        };

        int max = arr[0][0];

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }

        System.out.println(max);
    }
}
