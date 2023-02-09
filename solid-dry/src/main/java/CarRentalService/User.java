package CarRentalService;
import lombok.*;

@Data
public class User {

    @NonNull
    public String name;
    @NonNull
    public String surname;

}
