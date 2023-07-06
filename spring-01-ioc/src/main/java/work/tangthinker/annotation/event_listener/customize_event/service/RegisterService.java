/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.event_listener.customize_event.service
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-04 13:29:13:29
 */
package work.tangthinker.annotation.event_listener.customize_event.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
import work.tangthinker.annotation.event_listener.customize_event.event.RegisterSuccessEvent;

/**
 * @author Jon Snow
 * @since 2023/7/4 13:29
 * ClassPath: work.tangthinker.annotation.event_listener.customize_event.service.RegisterService
 * Description:
 */
@Service
public class RegisterService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String username){
        System.out.println(username + " register success!");
        applicationEventPublisher.publishEvent(new RegisterSuccessEvent(username));
    }
}
