/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.autowired.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 16:56:16:56
 */
package work.tangthinker.annotation.qualifier.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/6/28 16:56
 * ClassPath: work.tangthinker.annotation.autowired.bean.AutowiredPerson
 * Description:
 */
@Component("shanliao")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class QualifierPerson {


    private String name;

    private Integer age;



}
