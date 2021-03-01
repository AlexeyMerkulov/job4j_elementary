package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] copyL = new int[left.length + 1];
        int[] copyR = new int[right.length + 1];
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            copyL[i] = left[i];
        }
        for (int j = 0; j < right.length; j++) {
            copyR[j] = right[j];
        }
        copyL[left.length] = Integer.MAX_VALUE;
        copyR[right.length] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if (copyL[i] <= copyR[j]) {
                rsl[k] = copyL[i];
                i++;
            } else {
                rsl[k] = copyR[j];
                j++;
            }
        }
        return rsl;
    }
}
