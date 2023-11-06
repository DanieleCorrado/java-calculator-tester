package bonus;

import java.util.Scanner;

public class TrainTicket {
    /*
     * Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
     * Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
     * il prezzo del biglietto è definito in base ai km (0.21 € al km)
     * va applicato uno sconto del 20% per i minorenni
     *  va applicato uno sconto del 40% per gli over 65.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("How many km do you have to travel? ");
        double km = scanner.nextDouble();
        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        Ticket ticket = new Ticket();
        double price = ticket.getPrice(age, km);

        System.out.println("The ticket price is " + price + " €");


        // Chiusura scanner
        scanner.close();
    }
}
