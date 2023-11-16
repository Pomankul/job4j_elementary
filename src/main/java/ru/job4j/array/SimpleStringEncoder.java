package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i) && i < input.length() - 1) {
                counter++;
            } else if (symbol == input.charAt(i) && i == input.length() - 1) {
                counter++;
                result += symbol + "" + counter;
            } else {
                result += switch (counter) {
                    case 1 -> symbol;
                    default -> symbol + "" + counter;
                };
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        if (input.length() == 1 || input.charAt(input.length() - 2) != symbol) {
            result += symbol;
        }
        return result;
    }
}
