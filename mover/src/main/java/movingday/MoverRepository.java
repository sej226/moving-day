package movingday;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="movers", path="movers")
public interface MoverRepository extends PagingAndSortingRepository<Mover, Long>{


}
