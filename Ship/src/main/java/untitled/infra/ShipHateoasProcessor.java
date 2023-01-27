package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class ShipHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ship>> {

    @Override
    public EntityModel<Ship> process(EntityModel<Ship> model) {
        return model;
    }
}
