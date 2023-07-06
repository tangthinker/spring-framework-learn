/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.event_listener.customize_event
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 13:22:13:22
 */
package work.tangthinker.annotation.event_listener.customize_event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.event_listener.customize_event.service.RegisterService;

/**
 * @author Jon Snow
 * @since 2023/7/4 13:22
 * ClassPath: work.tangthinker.annotation.event_listener.customize_event.CustomizeEventApplication
 * Description:
 */
public class CustomizeEventApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("work.tangthinker.annotation.event_listener.customize_event");
        RegisterService registerService = context.getBean(RegisterService.class);
        registerService.register("shanliao");
    }


}
