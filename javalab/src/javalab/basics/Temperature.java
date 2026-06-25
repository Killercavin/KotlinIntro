package javalab.basics;

import java.util.Scanner;

public class Temperature {

    float convertToFahrenheit(float temperature) {
        return (temperature * 9 / 5) + 32f;
    }

    float convertToCelsius(float temperature) {
        return (temperature - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float tempInCelsius = input.nextFloat();

        System.out.print("Enter temperature in Fahrenheit: ");
        float tempInFahrenheit = input.nextFloat();

        float resultInFahrenheit = temperature.convertToFahrenheit(tempInCelsius);
        System.out.println("The temperature in Fahrenheit is " + resultInFahrenheit);

        float resultInCelsius =  temperature.convertToCelsius(tempInFahrenheit);
        System.out.println("The temperature in Celsius is " + resultInCelsius);
    }
}
