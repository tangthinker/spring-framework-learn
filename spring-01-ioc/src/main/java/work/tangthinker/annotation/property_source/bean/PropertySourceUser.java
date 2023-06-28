/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.property_source.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 10:38:10:38
 */
package work.tangthinker.annotation.property_source.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/6/28 10:38
 * ClassPath: work.tangthinker.annotation.property_source.bean.PropertySourceUser
 * Description:
 */
@ToString
@Component
public class PropertySourceUser {

    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;



}
