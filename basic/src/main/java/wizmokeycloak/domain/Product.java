package wizmokeycloak.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import wizmokeycloak.BasicApplication;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long stock;

    private String name;

    public static ProductRepository repository() {
        ProductRepository productRepository = BasicApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }
}
//>>> DDD / Aggregate Root
