package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("calculate correct sum between two number")
    void add() {

        // Crea due array di numeri casuali deterministici

        int firstSeed = 123456789;
        Random firstRandom = new Random(firstSeed);
        float[] firstNumbers = new float[100];

        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = firstRandom.nextFloat(1000);
        }

        int secondSeed = 987654321;
        Random secondRandom = new Random(secondSeed);
        float[] secondNumbers = new float[100];

        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = secondRandom.nextFloat(1000);
        }

        // Controlla se la somma è correttà

        for (float firstNumber : firstNumbers) {

            for (float secondNumber : secondNumbers) {

                assertEquals(firstNumber + secondNumber, Calculator.add(firstNumber, secondNumber));

            }
        }

        // Controlla se viene lanciata una NumberFormatException se il valore inserito non è un valore numerico

        assertThrows(NumberFormatException.class, () -> {
            Calculator.add(Float.parseFloat("a"), (float) 5.0);
        });
        assertThrows(NumberFormatException.class, () -> {
            Calculator.add((float) 5.0, Float.parseFloat("a"));
        });
    }

    @Test
    @DisplayName("calculate correct subtraction between two number")
    void subtract() {

        // Crea due array di numeri casuali deterministici

        int firstSeed = 123456789;
        Random firstRandom = new Random(firstSeed);
        float[] firstNumbers = new float[100];

        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = firstRandom.nextFloat(1000);
        }

        int secondSeed = 987654321;
        Random secondRandom = new Random(secondSeed);
        float[] secondNumbers = new float[100];

        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = secondRandom.nextFloat(1000);
        }

        // Controlla se la sottrazione è correttà

        for (float firstNumber : firstNumbers) {

            for (float secondNumber : secondNumbers) {

                assertEquals(firstNumber - secondNumber, Calculator.subtract(firstNumber, secondNumber));

            }
        }

        // Controlla se viene lanciata una NumberFormatException se il valore inserito non è un valore numerico

        assertThrows(NumberFormatException.class, () -> {
            Calculator.subtract(Float.parseFloat("a"), (float) 5.0);
        });
        assertThrows(NumberFormatException.class, () -> {
            Calculator.subtract((float) 5.0, Float.parseFloat("a"));
        });
    }

    @Test
    @DisplayName("calculate correct division between two number")
    void divide() {


        // Crea due array di numeri casuali deterministici

        int firstSeed = 123456789;
        Random firstRandom = new Random(firstSeed);
        float[] firstNumbers = new float[100];

        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = firstRandom.nextFloat(1000);
        }

        int secondSeed = 987654321;
        Random secondRandom = new Random(secondSeed);
        float[] secondNumbers = new float[100];

        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = secondRandom.nextFloat(1000);
        }

        // Controlla se la divisione è correttà

        assertEquals(Float.NaN, Calculator.divide((float) 0.0, (float) 0.0));

        for (float firstNumber : firstNumbers) {

            assertEquals(Float.POSITIVE_INFINITY, Calculator.divide(firstNumber, (float) 0.0));

            for (float secondNumber : secondNumbers) {

                assertEquals(firstNumber / secondNumber, Calculator.divide(firstNumber, secondNumber));

                assertEquals(Float.POSITIVE_INFINITY, Calculator.divide(secondNumber, (float) 0.0));

            }
        }

        // Controlla se viene lanciata una NumberFormatException se il valore inserito non è un valore numerico

        assertThrows(NumberFormatException.class, () -> {
            Calculator.divide(Float.parseFloat("a"), (float) 5.0);
        });

        assertThrows(NumberFormatException.class, () -> {
            Calculator.divide((float) 5.0, Float.parseFloat("a"));
        });

    }

    @Test
    @DisplayName("calculate correct multiplication between two number")
    void multiply() {

        // Crea due array di numeri casuali deterministici

        int firstSeed = 123456789;
        Random firstRandom = new Random(firstSeed);
        float[] firstNumbers = new float[100];

        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] = firstRandom.nextFloat(1000);
        }

        int secondSeed = 987654321;
        Random secondRandom = new Random(secondSeed);
        float[] secondNumbers = new float[100];

        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = secondRandom.nextFloat(1000);
        }

        // Controlla se la sottrazione è correttà

        for (float firstNumber : firstNumbers) {

            for (float secondNumber : secondNumbers) {

                assertEquals(firstNumber * secondNumber, Calculator.multiply(firstNumber, secondNumber));

            }
        }

        // Controlla se viene lanciata una NumberFormatException se il valore inserito non è un valore numerico

        assertThrows(NumberFormatException.class, () -> {
            Calculator.multiply(Float.parseFloat("a"), (float) 5.0);
        });
        assertThrows(NumberFormatException.class, () -> {
            Calculator.multiply((float) 5.0, Float.parseFloat("a"));
        });
    }
}