package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {

    Long getId();

    String getName();

    Long getSize();

    String getContentType();

}
