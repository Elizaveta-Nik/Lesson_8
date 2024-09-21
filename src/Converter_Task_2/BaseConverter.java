package Converter_Task_2;

public class BaseConverter {

    public double convert(double temperature, TemperatureScale from, TemperatureScale to) {
        if (from == to) {
            return temperature;
        }

        double tempInCelsius;
        switch (from) {
            case KELVIN -> tempInCelsius = temperature - 273.15;
            case FAHRENHEIT -> tempInCelsius = (temperature - 32) / 1.8;
            default -> tempInCelsius = temperature;
        }

        switch (to) {
            case KELVIN -> {
                return tempInCelsius + 273.15;
            }
            case FAHRENHEIT -> {
                return tempInCelsius * 1.8 + 32;
            }
            default -> {
                return tempInCelsius;
            }
        }
    }
}
