/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.component_scan_filter
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 09:38:09:38
 */
package work.tangthinker.annotation.component_scan_filter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import work.tangthinker.annotation.component_scan_filter.annotation.Database;
import work.tangthinker.annotation.component_scan_filter.bean.HelloController;
import work.tangthinker.annotation.component_scan_filter.bean.Service;
import work.tangthinker.annotation.component_scan_filter.type_filter.ControllerTypeFilter;

/**
 * @author Jon Snow
 * @since 2023/7/7 09:38
 * ClassPath: work.tangthinker.annotation.component_scan_filter.ComponentScanFilterConfig
 * Description:
 */
@Configuration
@ComponentScan(value = "work.tangthinker.annotation.component_scan_filter",
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Database.class),
    excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Service.class),
                @ComponentScan.Filter(type =FilterType.CUSTOM, value = ControllerTypeFilter.class)})
public class ComponentScanFilterConfig {
}
