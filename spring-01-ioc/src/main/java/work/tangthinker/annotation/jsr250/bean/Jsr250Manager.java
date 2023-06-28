/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.jsr250.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 20:37:20:37
 */
package work.tangthinker.annotation.jsr250.bean;

import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author shanliao
 * @since 2023/6/28 20:37
 * ClassPath: work.tangthinker.annotation.jsr250.bean.Jsr250Manager
 * Description:
 */
@Component
@ToString
public class Jsr250Manager {

    @Resource(name = "king")
    private Jsr250User managerUser;


    @Inject
    @Named("shanliao")
    private Jsr250User beManagerUser;


}
