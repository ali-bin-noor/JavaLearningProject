package practiceJavaPrograms.arrayList;

public class AddingTwoArraysIntoThirdArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 9, 10};
        int[] b = {1, 3, 4, 5, 7, 8};
        int[] c = new int[a.length + b.length];

        for (int element : c) {
            System.out.print(element + " ");
        }
        System.out.println();
        mergeArray(a, b, c);
        for (int element : c) {
            System.out.print(element + " ");
        }
    }

    private static void mergeArray(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            c[k++] = a[i] < b[j] ? a[i++] : b[j++];
            /*if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }*/
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
