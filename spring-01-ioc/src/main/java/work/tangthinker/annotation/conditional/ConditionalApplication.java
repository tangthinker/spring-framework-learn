/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.conditional
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-06 18:26:18:26
 */
package work.tangthinker.annotation.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.conditional.config.ConditionalConfig;

import java.util.stream.Stream;

/**
 * @author Jon Snow
 * @since 2023/7/6 18:26
 * ClassPath: work.tangthinker.annotation.conditional.ConditionalApplication
 * Description:
 */
public class ConditionalApplication {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
    }


}
