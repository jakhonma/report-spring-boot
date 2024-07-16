package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Attachment;
import report.uz.report.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {

    Long getId();

    Byte[] getBytes();

    Attachment getAttachment();
}
