package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        if (money == price) {
            return Arrays.copyOf(rsl, size);
        }
        money -= price;
        for (int coin: coins) {
            while (money >= coin) {
                money -= coin;
                rsl[size] = coin;
                size++;
            }
            if (money == 0) {
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
