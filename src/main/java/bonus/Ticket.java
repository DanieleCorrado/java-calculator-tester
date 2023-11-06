package bonus;

import exception.InvalidAgeException;
import exception.InvalidKmException;

public class Ticket {

    // ATTRIBUTI
    private final double pricePerKm = 0.21;
    private final int juniorDiscount = 20;
    private final int seniorDiscount = 40;

    // COSTRUTTORI

    public Ticket() {
    }

    public double getPrice(int age, double km) throws InvalidAgeException, InvalidKmException {

        if(age <= 0) {
            throw new InvalidAgeException();
        }

        if (km <=0) {
            throw new InvalidKmException();
        }

        double price = pricePerKm * km;

        if(age < 18) {
            double discount = (price * juniorDiscount) / 100;
            price = price - discount;
        } else if (age > 65) {
            double discount = (price * seniorDiscount) / 100;
            price = price - discount;
        }

        return price;
    }
}
