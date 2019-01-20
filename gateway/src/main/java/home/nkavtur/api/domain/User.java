package home.nkavtur.api.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {

    private String uuid;

    private String email;

    private String creditCard;

    private String country;
}
