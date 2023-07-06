/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.context_refreshed_event
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 13:16:13:16
 */
package work.tangthinker.annotation.event_listener;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Jon Snow
 * @since 2023/7/4 13:16
 * ClassPath: work.tangthinker.annotation.context_refreshed_event.EventListenerPerson
 * Description:
 */
@Component
public class EventListenerPerson {

    @PostConstruct
    public void start(){
        System.out.println("EventListenerPerson.start()");
    }


}
