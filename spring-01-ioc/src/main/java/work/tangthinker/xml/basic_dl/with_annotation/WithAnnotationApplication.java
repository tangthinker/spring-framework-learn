/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.basic_dl.with_annotation
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 22:37:22:37
 */
package work.tangthinker.xml.basic_dl.with_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.basic_dl.with_annotation.annotation.DriverClass;
import work.tangthinker.xml.basic_dl.with_annotation.annotation.StartClass;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @author shanliao
 * @since 2023/6/27 22:37
 * ClassPath: work.tangthinker.basic_dl.with_annotation.WithAnnotationApplication
 * Description:
 */
public class WithAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/with-annotation.xml");
        Map<String, Object> startClasses = applicationContext.getBeansWithAnnotation(StartClass.class);
        Map<String, Object> driverClasses = applicationContext.getBeansWithAnnotation(DriverClass.class);
        startClasses.forEach((name, object) -> {
            System.out.println(name + "  : " + object);
        });

        driverClasses.forEach((name, object) -> {
            System.out.println(name + " : " + object);
        });

        // 获取所有bean的name，也就是id
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }



}
