/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.event_listener.customize_event.listener
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 13:25:13:25
 */
package work.tangthinker.annotation.event_listener.customize_event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import work.tangthinker.annotation.event_listener.customize_event.event.RegisterSuccessEvent;

/**
 * @author Jon Snow
 * @since 2023/7/4 13:25
 * ClassPath: work.tangthinker.annotation.event_listener.customize_event.listener.SmsSenderListener
 * Description:
 */
@Component
public class SmsSenderListener implements ApplicationListener<RegisterSuccessEvent> {
    @Override
    public void onApplicationEvent(RegisterSuccessEvent event) {
        System.out.println("Register success, send sms to " + event.getSource());
    }
}
