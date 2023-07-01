/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:28:17:28
 */
package work.tangthinker.annotation.life_cycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.life_cycle.bean.LifeCyclePerson;

/**
 * @author shanliao
 * @since 2023/7/1 17:28
 * ClassPath: work.tangthinker.annotation.life_cycle.LifeCycleConfig
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.life_cycle.bean")
public class LifeCycleConfig {

    @Bean(name = "shanliao", initMethod = "init", destroyMethod = "destroy")
    public LifeCyclePerson getPerson(){
        return new LifeCyclePerson("shanliao");
    }

}
