import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {

    public static void main(String[] args) {
        // Create necessary objects for input and random numbers
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Task 1: Declare an array of type int named dataPoints
        int[] dataPoints = new int[100];

        // Task 2: Initialize array with random values 1-100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display array values separated by " | "
        System.out.println("Task 3: Array Display");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
        // Task 4: Calculate sum and average
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        average = (double) sum / dataPoints.length;

        System.out.println("\nTask 4: Sum and Average");
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);


        // Task 5: Input an int value between 1 and 100
        System.out.println("\nTask 5 & 6: Value Counter");
        int userValue = SafeInput.getRangedInt(in, "Enter an integer value", 1, 100);

        // Task 6: Count occurrences of user's value
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " time(s) in the array.");

        // Task 7: Find first occurrence of a new value
        System.out.println("\nTask 7: Find First Occurrence");
        int userValue2 = SafeInput.getRangedInt(in, "Enter another integer value", 1, 100);

        boolean found = false;
        int foundAtIndex = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                found = true;
                foundAtIndex = i;
                break;
            }
        }

        if (found) {
            System.out.println("The value " + userValue2 + " was found at array index " + foundAtIndex + ".");
        } else {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }

        // Task 8: Find minimum and maximum values
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {

            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("\nTask 8: Min and Max");
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Task 9: Call the getAverage static method
        System.out.println("\nTask 9: getAverage Method Test");
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

    } // End of main method

    // --- Task 9 Method ---

    /**
     * Calculates the average of an array of integers.
     *
     * @param values The array of integers.
     * @return The average of the values as a double.
     */
    public static double getAverage(int values[]) {
        int sum = 0;

        if (values.length == 0) {
            return 0.0;
        }

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }


        return (double) sum / values.length;
    }

}