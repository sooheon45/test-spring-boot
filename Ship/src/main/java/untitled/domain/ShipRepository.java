package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "ships", path = "ships")
public interface ShipRepository
    extends PagingAndSortingRepository<Ship, Long> {}
