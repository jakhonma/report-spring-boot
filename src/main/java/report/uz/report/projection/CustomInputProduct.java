package report.uz.report.projection;

import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.InputProduct;
import report.uz.report.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Long getId();

    Integer getAmount();

    Integer getPrice();

    Date getExpireDate();

    Product getProduct();

}
