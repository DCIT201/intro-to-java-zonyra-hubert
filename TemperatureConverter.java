package Temp;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner; // Importing Scanner for user input


    public class TemperatureConverter {
        public static void main(String[] args) {
            while (true) {
                // Creating a Scanner object to get input from the user
                Scanner scanner = new Scanner(System.in);

                // Displaying menu options to the user
                System.out.println("Welcome to the Temperature Converter!");
                System.out.println("Please choose an option:");
                System.out.println("1. Convert Celsius to Fahrenheit");
                System.out.println("2. Convert Fahrenheit to Celsius");


                System.out.print("Enter your choice (1 or 2): ");
                int choice = 0; // Variable to store the user's choice
                choice = scanner.nextInt(); // Read the choice

                // Asking the user for their choice and validating it
                if (choice == 1) {
                    System.out.println("Please enter a temperature in celsius");
                } else {
                    System.out.println("You have entered an invalid option");
                }

                // Asking the user for the temperature value
                System.out.print("Enter the temperature to convert: ");

                double temperature = 0; // Variable to store the temperature
                if (scanner.hasNextDouble()) {
                    temperature = scanner.nextDouble(); // Read the temperature
                } else {
                    // If the input is not a number, print an error and exit
                    System.out.println("Invalid input. Please run the program again.");

                }


                // Variable to store the converted temperature
                double convertedTemperature;

                // Performing the conversion based on the user's choice
                if (choice == 1) {
                    // Convert Celsius to Fahrenheit
                    convertedTemperature = (temperature * 9 / 5) + 32;
                    System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F");
                } else {
                    // Convert Fahrenheit to Celsius
                    convertedTemperature = (temperature - 32) * 5 / 9;
                    System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C");
                }
                //Asking the user if he/she wants to continue/perform another convertion
                System.out.println("Do you want to continue? (y/n)");
                String responds = scanner.next();  // taking the responds
              if (responds.equalsIgnoreCase("n")) {
                  // Ending message
                  System.out.println("Thank you for using the Temperature Converter!");
                  break;
              }


            }
        }
    }


