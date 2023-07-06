/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.context_refreshed_event
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 13:00:13:00
 */
package work.tangthinker.annotation.event_listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/7/4 13:00
 * ClassPath: work.tangthinker.annotation.context_refreshed_event.ContextRefreshedApplicationListener
 * Description:
 */
@Component
public class ContextRefreshedApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedApplicationListener listened ContextRefreshedEvent");
    }
}
