/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.event_listener.customize_event.listener
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 13:28:13:28
 */
package work.tangthinker.annotation.event_listener.customize_event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import work.tangthinker.annotation.event_listener.customize_event.event.RegisterSuccessEvent;

/**
 * @author Jon Snow
 * @since 2023/7/4 13:28
 * ClassPath: work.tangthinker.annotation.event_listener.customize_event.listener.MessageSenderListener
 * Description:
 */
@Component
public class MessageSenderListener {

    @EventListener
    @Order(0)
    public void onRegisterSuccess(RegisterSuccessEvent event){
        System.out.println("Register success, send message to " + event.getSource());
    }


}
