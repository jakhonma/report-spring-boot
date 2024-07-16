package report.uz.report.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import report.uz.report.projection.CustomClient;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class)
public interface ClientRepository {
}
