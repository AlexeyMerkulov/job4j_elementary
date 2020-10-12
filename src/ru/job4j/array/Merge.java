package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] copyLeft = new int[left.length + 1];
        int[] copyRight = new int[right.length + 1];
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            copyLeft[i] = left[i];
        }
        for (int j = 0; j < right.length; j++) {
            copyRight[j] = right[j];
        }
        copyLeft[left.length] = Integer.MAX_VALUE;
        copyRight[right.length] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if (copyLeft[i] <= copyRight[j]) {
                rsl[k] = copyLeft[i];
                i++;
            } else {
                rsl[k] = copyRight[j];
                j++;
            }
        }
        return rsl;
    }
}
