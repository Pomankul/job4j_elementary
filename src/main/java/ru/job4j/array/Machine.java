package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int change = money - price;
        int[] rsl = new int[100];
        int size = 0;
        if (change == 0) {
            return Arrays.copyOf(rsl, size);
        }
        for (int i = 0; i < coins.length; i++) {
            while (change >= coins[i]) {
                change -= coins[i];
                rsl[size] = coins[i];
                size++;
            }
            if (change == 0) {
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
