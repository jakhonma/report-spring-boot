package report.uz.report.projection;

import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Client;
import report.uz.report.entity.Currency;
import report.uz.report.entity.Output;
import report.uz.report.entity.WareHouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Long getId();

    Timestamp getDate();

    Integer getFactureNumber();

    String getCode();

    WareHouse getWareHouse();

    Client getClient();

    Currency getCurrency();

}
