/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.component_scan
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 23:43:23:43
 */
package work.tangthinker.annotation.component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.component_scan.bean.SomeBean;

import java.util.stream.Stream;

/**
 * @author shanliao
 * @since 2023/6/27 23:43
 * ClassPath: work.tangthinker.annotation.component_scan.ComponentScanApplication
 * Description:
 */
public class ComponentScanApplication {

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext("work.tangthinker.annotation.component_scan.bean");
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        SomeBean bean = context.getBean(SomeBean.class);
        System.out.println(bean);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }


}
