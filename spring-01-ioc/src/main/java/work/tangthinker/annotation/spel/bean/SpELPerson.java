/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.spel.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 15:03:15:03
 */
package work.tangthinker.annotation.spel.bean;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/6/28 15:03
 * ClassPath: work.tangthinker.annotation.spel.bean.SpELPerson
 * Description:
 */
@Component("person")
@Getter
@ToString
public class SpELPerson {

    @Value("#{'shanliao'}")
    private String name;

    @Value("#{22}")
    private Integer age;



}
