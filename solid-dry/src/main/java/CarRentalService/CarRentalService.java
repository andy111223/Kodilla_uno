package CarRentalService;
import lombok.*;

import java.time.LocalDateTime;
@Data
public class CarRentalService implements RentalService{

    public boolean rent (final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {

        System.out.println("Renting Car from: " + user.getName() + user.getSurname() + " from: " +
                carRentFrom.toString() + " to: " + carRentTo.toString());

        return true;
    }

}
