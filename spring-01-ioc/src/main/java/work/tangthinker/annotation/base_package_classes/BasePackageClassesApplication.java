/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.base_package_classes
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-07 01:15:1:15
 */
package work.tangthinker.annotation.base_package_classes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @author shanliao
 * @since 2023/7/7 1:15
 * ClassPath: work.tangthinker.annotation.base_package_classes.BasePackageClassesApplication
 * Description:
 */
public class BasePackageClassesApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasePackageClassesConfiguration.class);
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
    }


}
