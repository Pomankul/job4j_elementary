package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j < array.length) {
                if (i != j && array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
                j++;
            }
        }
        return new int[0];
    }
}
