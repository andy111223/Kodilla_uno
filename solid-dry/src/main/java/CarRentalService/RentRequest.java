package CarRentalService;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class RentRequest {

    private User user;
    private LocalDateTime from;
    private LocalDateTime to;


}
