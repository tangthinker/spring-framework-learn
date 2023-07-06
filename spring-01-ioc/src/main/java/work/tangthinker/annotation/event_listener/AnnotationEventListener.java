/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.context_refreshed_event
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 13:05:13:05
 */
package work.tangthinker.annotation.event_listener;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/7/4 13:05
 * ClassPath: work.tangthinker.annotation.context_refreshed_event.AnnotationEventListener
 * Description:
 */
@Component
public class AnnotationEventListener {

    @EventListener
    public void onContextRefreshedEvent(ContextClosedEvent event){
        System.out.println("AnnotationEventListener listened ContextClosedEvent!");
        System.out.println("Event time:" + event.getTimestamp() + "ms");
        System.out.println("Application context: " + event.getApplicationContext());
    }

    @EventListener
    public void onContextStartedEvent(ContextStartedEvent event){
        System.out.println("AnnotationEventListener listened ContextStartedEvent!");
    }

    @EventListener
    public void onContextStoppedEvent(ContextStoppedEvent event){
        System.out.println("AnnotationEventListener listened ContextStoppedEvent!");
    }


}
