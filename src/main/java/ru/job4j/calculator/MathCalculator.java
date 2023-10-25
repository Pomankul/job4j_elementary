package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subsAndDiv(double first, double second) {
        return subs(first, second) + div(first, second);
    }

    public static double sumTotal(double first, double second) {
        return sumAndMultiply(first, second) + subsAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета сумма и произведение: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета вычитание и деление: " + subsAndDiv(10, 20));
        System.out.println("Результат расчета все действия: " + sumTotal(10, 20));
    }
}
