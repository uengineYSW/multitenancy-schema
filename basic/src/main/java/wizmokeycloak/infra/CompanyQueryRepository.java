package wizmokeycloak.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wizmokeycloak.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "companyQueries",
    path = "companyQueries"
)
public interface CompanyQueryRepository
    extends PagingAndSortingRepository<CompanyQuery, Long> {}
