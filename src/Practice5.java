public class Practice5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -10};

        findMin(arr);
        System.out.println(findMin(arr));
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
