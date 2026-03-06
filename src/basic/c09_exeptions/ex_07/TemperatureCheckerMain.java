package basic.c09_exeptions.ex_07;

import basic.c09_exeptions.ex_07.exceptions.CustomExceptionTemperature;

public class TemperatureCheckerMain {
    public static void main(String[] args) {
        var temperatureChecker = new TemperatureChecker();

        try {
            temperatureChecker.checkTemperature(150);
        } catch (CustomExceptionTemperature e) {
            System.out.println("[ERROR] Revisando la temperatura: " + e.getMessage());
        }
    }
}
