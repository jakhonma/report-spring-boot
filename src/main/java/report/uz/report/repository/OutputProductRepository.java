package report.uz.report.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import report.uz.report.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository {
}
