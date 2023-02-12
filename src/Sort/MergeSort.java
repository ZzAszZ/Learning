package Sort;

public class MergeSort {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int n = a1.length;
        int m = a2.length;
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a1[i] <= a2[j]) {
                res[k] = a1[i];
                i++; }
            else {
                res[k] = a2[j];
                j++; }
            k++; }
        while (i < n) {
            res[k] = a1[i];
            i++;
            k++; }
        while (j < m) {
            res[k] = a2[j];
            j++;
            k++; }
        return res;
    }
}
