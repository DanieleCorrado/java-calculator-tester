package bonus;

import exception.InvalidAgeException;
import exception.InvalidKmException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    @DisplayName("calculate correct ticket price")
    void getPrice() {

        Ticket ticket = new Ticket();

        // Crea un array di numeri casuali deterministici

        int firstSeed = 123456789;
        Random random = new Random(firstSeed);
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-1000,0);
        }

        // Controlla se viene lanciata una InvalidAgeException o InvalidKmException se il valore inserito non è un valore numerico

        for (int i = 0; i < numbers.length; i++) {

            int finalI = i;

            assertThrows(InvalidAgeException.class, () -> {
                ticket.getPrice(numbers[finalI],32);
            });

            assertThrows(InvalidKmException.class, () -> {
                ticket.getPrice(5,numbers[finalI]);
            });
        }

        assertEquals(210, Math.round(ticket.getPrice(18, 10)*100));

        assertEquals(168, Math.round(ticket.getPrice(17, 10)*100));

        assertEquals(126, Math.round(ticket.getPrice(66, 10)*100));

    }
}