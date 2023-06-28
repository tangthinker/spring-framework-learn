/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.property_inject.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 10:29:10:29
 */
package work.tangthinker.annotation.property_inject.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/6/28 10:29
 * ClassPath: work.tangthinker.annotation.property_inject.bean.ProrpertyInjectUser
 * Description:
 */
@Component
@ToString
public class PropertyInjectUser {

    @Value("shanliao")
    private String username;

    @Value("333")
    private String password;


}
