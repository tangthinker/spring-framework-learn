/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.xml.life_cycle.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:17:17:17
 */
package work.tangthinker.xml.life_cycle.bean;

import lombok.*;

/**
 * @author shanliao
 * @since 2023/7/1 17:17
 * ClassPath: work.tangthinker.xml.life_cycle.bean.LifeCyclePerson
 * Description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LifeCyclePerson {

    private String name;

    private Integer age;

    public void init(){
        System.out.println(this + " 被初始化了！");
    }

    public void destroy(){
        System.out.println(this + " 被销毁了！");
    }


}
