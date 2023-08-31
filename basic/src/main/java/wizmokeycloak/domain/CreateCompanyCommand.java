package wizmokeycloak.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateCompanyCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String code;

    private String name;
    private String industry;
    private String foundedDate;
}
