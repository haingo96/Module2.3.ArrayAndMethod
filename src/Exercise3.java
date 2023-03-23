public class Exercise3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        int[] arrTotal = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arrTotal, 0, arr1.length);

        for (int i = arr1.length, j = 0; i < arrTotal.length; i++, j++) {
            arrTotal[i] = arr2[j];
        }

        for (int j : arrTotal) {
            System.out.println(j);
        }
    }
}
