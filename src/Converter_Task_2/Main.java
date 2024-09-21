package Converter_Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseConverter converter = new BaseConverter();

        System.out.print("Введите температуру: ");
        double temp = Double.parseDouble(scanner.nextLine());

        System.out.print("Введите исходную шкалу (C, K, F): ");
        TemperatureScale from = getScale(scanner.nextLine());

        System.out.print("Введите целевую шкалу (C, K, F): ");
        TemperatureScale to = getScale(scanner.nextLine());


        double result = converter.convert(temp, from, to);
        System.out.printf("%.2f %s = %.2f %s%n", temp, from, result, to);

        scanner.close();
    }


    private static TemperatureScale getScale(String scale) {
        switch (scale.toUpperCase()) {
            case "C":
                return TemperatureScale.CELSIUS;
            case "K":
                return TemperatureScale.KELVIN;
            case "F":
                return TemperatureScale.FAHRENHEIT;
            default:
                throw new IllegalArgumentException("Неверная шкала: " + scale);
        }
    }
}



