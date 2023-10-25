package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);

        float inDol = 120;
        float expectedDol = 2;
        float outDol = Converter.rubleToDollar(inDol);
        boolean passedDol = expectedDol == outDol;
        System.out.println("120 rubles are 2. Test result : " + passedDol);

        float euro = Converter.rubleToEuro(70);
        float dollar = Converter.rubleToDollar(60);
        System.out.println("70 rubles are " + euro + " euro");
        System.out.println("60 rubles are " + dollar + " dollar");
    }
}
