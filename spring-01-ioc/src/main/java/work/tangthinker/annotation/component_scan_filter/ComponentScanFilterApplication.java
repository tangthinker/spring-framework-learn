/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.component_scan_filter
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 09:36:09:36
 */
package work.tangthinker.annotation.component_scan_filter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @author Jon Snow
 * @since 2023/7/7 09:36
 * ClassPath: work.tangthinker.annotation.component_scan_filter.ComponentScanFilterApplication
 * Description:
 */
public class ComponentScanFilterApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanFilterConfig.class);
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
    }


}
