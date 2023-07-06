/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.profile
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-06 18:07:18:07
 */
package work.tangthinker.annotation.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.profile.config.SystemConfig;
import work.tangthinker.annotation.profile.config.SystemLogConfig;

import java.util.stream.Stream;

/**
 * @author Jon Snow
 * @since 2023/7/6 18:07
 * ClassPath: work.tangthinker.annotation.profile.ProfileApplication
 * Description:
 */
public class ProfileApplication {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("prod");
//        context.register(SystemConfig.class);
//        context.refresh();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SystemConfig.class);
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
        // 设置VM options: -Dspring.profiles.active=test
    }


}
