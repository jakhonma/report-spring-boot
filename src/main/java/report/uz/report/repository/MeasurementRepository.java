package report.uz.report.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import report.uz.report.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository {
}
