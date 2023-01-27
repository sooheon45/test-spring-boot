package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.ShipApplication;

@Entity
@Table(name = "Ship_table")
@Data
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {}

    public static ShipRepository repository() {
        ShipRepository shipRepository = ShipApplication.applicationContext.getBean(
            ShipRepository.class
        );
        return shipRepository;
    }
}
