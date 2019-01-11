package home.nkavtur.mictometerdemo.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
public class User {

    private String uuid;

    private String email;

    private String creditCard;

    private String country;
}
