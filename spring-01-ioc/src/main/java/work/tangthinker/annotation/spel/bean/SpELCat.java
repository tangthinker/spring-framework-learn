/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.spel.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 15:04:15:04
 */
package work.tangthinker.annotation.spel.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/6/28 15:04
 * ClassPath: work.tangthinker.annotation.spel.bean.SpELCat
 * Description:
 */
@Component
@ToString
public class SpELCat {

    @Value("#{person.name + '的小猫'}")
    private String name;

    @Value("#{person.age - 1}")
    private Integer age;


    // SpEL使用注意，直接.出来来对象的属性值时，至少需要Getter，或者为public属性



}
