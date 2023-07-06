/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.context_refreshed_event
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 12:59:12:59
 */
package work.tangthinker.annotation.event_listener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Jon Snow
 * @since 2023/7/4 12:59
 * ClassPath: work.tangthinker.annotation.context_refreshed_event.ContextRefreshedEventApplication
 * Description:
 */
public class ContextRefreshedEventApplication {

    public static void main(String[] args) {
        System.out.println("IOC container is initialing...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("work.tangthinker.annotation.event_listener");
        System.out.println("IOC container is initialized!");

        context.close();
        System.out.println("IOC container is closed!");
    }


}
