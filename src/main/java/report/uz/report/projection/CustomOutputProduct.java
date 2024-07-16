package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Output;
import report.uz.report.entity.OutputProduct;
import report.uz.report.entity.Product;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Long getId();

    Integer getAmount();

    Integer getPrice();

    Date gerExpireDate();

    Product getProduct();

    Output getOutput();

}
