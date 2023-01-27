package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.OrderApplication;
import untitled.domain.OrderPlcaced;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        untitled.external.Ship ship = new untitled.external.Ship();
        // mappings goes here
        OrderApplication.applicationContext
            .getBean(untitled.external.ShipService.class)
            .receiveOrder(ship);

        OrderPlcaced orderPlcaced = new OrderPlcaced(this);
        orderPlcaced.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
