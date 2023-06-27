/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.component_scan
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 23:40:23:40
 */
package work.tangthinker.annotation.component_scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shanliao
 * @since 2023/6/27 23:40
 * ClassPath: work.tangthinker.annotation.component_scan.ComponentScanConfiguration
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.component_scan.bean")
public class ComponentScanConfiguration {
}
