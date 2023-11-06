package model;

public interface Calculator {

    // METODI

    // Calcola la somma dei numeri
    static float add(float firstNumber, float secondNumber){

        return firstNumber + secondNumber;
    }

    // Calcola la differenza dei numeri
    static float subtract(float firstNumber, float secondNumber) {

        return firstNumber - secondNumber;
    }

    // Calcola il rapporto tra i numeri
    static float divide(float firstNumber, float secondNumber) {

        return firstNumber / secondNumber;
    }

    // Calcola il prodotto dei numeri
    static float multiply(float firstNumber, float secondNumber) {

        return firstNumber * secondNumber;
    }

}
