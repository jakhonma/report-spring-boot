package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {

    Long getId();

    String getName();

    String getPhoneNumber();

}
