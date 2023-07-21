/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.environmet
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-19 23:58:23:58
 */
package work.tangthinker.annotation.environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shanliao
 * @since 2023/7/19 23:58
 * ClassPath: work.tangthinker.annotation.environment.EnvironmentApplication
 * Description:
 */
public class EnvironmentApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(EnvironmentConfiguration.class);
        EnvironmentHolder environmentHolder = applicationContext.getBean(EnvironmentHolder.class);
        environmentHolder.print();

        EnvironmentByAware environmentByAware = applicationContext.getBean(EnvironmentByAware.class);
        environmentByAware.print();



    }

}
