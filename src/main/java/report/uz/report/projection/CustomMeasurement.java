package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Long getId();

    String getName();

    boolean getActive();

}
