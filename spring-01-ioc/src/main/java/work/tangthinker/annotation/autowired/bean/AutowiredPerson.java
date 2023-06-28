/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.autowired.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 16:56:16:56
 */
package work.tangthinker.annotation.autowired.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/6/28 16:56
 * ClassPath: work.tangthinker.annotation.autowired.bean.AutowiredPerson
 * Description:
 */
@Component
@ToString
public class AutowiredPerson {

    @Value("shanliao")
    private String name;

    @Value("22")
    private Integer age;



}
