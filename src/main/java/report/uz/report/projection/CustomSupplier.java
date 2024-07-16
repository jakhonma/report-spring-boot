package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Long getId();

    String getName();

    String getPhoneNumber();

    boolean getActive();

}
