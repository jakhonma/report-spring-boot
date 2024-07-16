package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Long getId();

    String getName();

    boolean getActive();

    Category getParentCategory();

}
