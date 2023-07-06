/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.event_listener.customize_event.event
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 13:23:13:23
 */
package work.tangthinker.annotation.event_listener.customize_event.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Jon Snow
 * @since 2023/7/4 13:23
 * ClassPath: work.tangthinker.annotation.event_listener.customize_event.event.RegisterSuccessEvent
 * Description:
 */
public class RegisterSuccessEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public RegisterSuccessEvent(Object source) {
        super(source);
    }
}
