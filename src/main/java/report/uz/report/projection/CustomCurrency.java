package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Long getId();

    String getName();

    boolean getActive();
}
