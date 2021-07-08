package movingday;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="movings", path="movings")
public interface MovingRepository extends PagingAndSortingRepository<Moving, Long>{


}
