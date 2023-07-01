/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle.inilitializing_disposable
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:39:17:39
 */
package work.tangthinker.annotation.life_cycle.inilitializing_disposable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.life_cycle.inilitializing_disposable.bean.LifeCycleInterfacePerson;

/**
 * @author shanliao
 * @since 2023/7/1 17:39
 * ClassPath: work.tangthinker.annotation.life_cycle.inilitializing_disposable.LifeCycleInterfaceConfig
 * Description:
 */
@Configuration
public class LifeCycleInterfaceConfig {

    @Bean
    public LifeCycleInterfacePerson person(){
        return new LifeCycleInterfacePerson();
    }


}
