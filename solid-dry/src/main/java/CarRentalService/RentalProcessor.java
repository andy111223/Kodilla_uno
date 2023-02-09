package CarRentalService;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;


    public RentalDto process (final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto (rentRequest.getUser(), false);
        }
    }

}
