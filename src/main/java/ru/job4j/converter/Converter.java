package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.printf("%s rubles are %s euro. Test result : %s%n", in, out, passed);
        in = 180;
        expected = 3;
        out =  Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.printf("%s rubles are %s dollars. Test result : %s%n", in, out, passed);
    }

}
