/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.component_scan_filter.type_filter
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 09:46:09:46
 */
package work.tangthinker.annotation.component_scan_filter.type_filter;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import work.tangthinker.annotation.component_scan_filter.bean.HelloController;

import java.io.IOException;

/**
 * @author Jon Snow
 * @since 2023/7/7 09:46
 * ClassPath: work.tangthinker.annotation.component_scan_filter.type_filter.ControllerTypeFilter
 * Description:
 */
public class ControllerTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        return metadataReader.getClassMetadata().getClassName().equals(HelloController.class.getName());
    }
}
