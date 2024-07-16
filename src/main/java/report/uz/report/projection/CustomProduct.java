package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Attachment;
import report.uz.report.entity.Category;
import report.uz.report.entity.Measurement;
import report.uz.report.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Long getId();

    String getName();

    String getCode();

    boolean getActive();

    Category getCategory();

    Attachment getAttachment();

    Measurement getMeasurement();
}
