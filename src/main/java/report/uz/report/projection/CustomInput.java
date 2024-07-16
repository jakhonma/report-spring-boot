package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Currency;
import report.uz.report.entity.Input;
import report.uz.report.entity.Supplier;
import report.uz.report.entity.WareHouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Long getId();

    Timestamp getDate();

    Integer getFactureNumber();

    String getCode();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency getCurrency();
}
