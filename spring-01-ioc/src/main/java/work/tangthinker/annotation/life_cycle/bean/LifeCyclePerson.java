/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:28:17:28
 */
package work.tangthinker.annotation.life_cycle.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author shanliao
 * @since 2023/7/1 17:28
 * ClassPath: work.tangthinker.annotation.life_cycle.bean.LifeCyclePerson
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LifeCyclePerson {


    private String name;

    public void init(){
        System.out.println(this + " 被初始化！");
    }

    public void destroy(){
        System.out.println(this + " 被销毁了！");
    }

    // PostConstruct和PreDestroy均为Jsr250规范的注解
    @PostConstruct
    public void init_1(){
        System.out.println("init_1");
    }

    @PreDestroy
    public void destroy_1(){
        System.out.println("destroy_1");
    }


}
