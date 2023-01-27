package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OrderPlcaced extends AbstractEvent {

    private Long id;

    public OrderPlcaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlcaced() {
        super();
    }
}
