package basic.c09_exeptions.ex_07;

import basic.c09_exeptions.ex_07.exceptions.CustomExceptionTemperature;

public class TemperatureChecker {
    public void checkTemperature(int temperature) throws CustomExceptionTemperature {
        if (temperature < -50 || temperature > 50) {
            throw new CustomExceptionTemperature("[ERROR] - La temperatura debe estar entre -50° y 50°");
        } else {
            System.out.println("Temperatura actual: " + temperature);
        }
    }
}
