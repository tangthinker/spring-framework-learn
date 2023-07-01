/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle.prototype
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:48:17:48
 */
package work.tangthinker.annotation.life_cycle.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import work.tangthinker.annotation.life_cycle.prototype.bean.PrototypePerson;

/**
 * @author shanliao
 * @since 2023/7/1 17:48
 * ClassPath: work.tangthinker.annotation.life_cycle.prototype.PrototypeConfig
 * Description:
 */
@Configuration
public class PrototypeConfig {


    @Bean(name = "shanliao", initMethod = "initMethod", destroyMethod = "destroyMethod")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypePerson person(){
        return new PrototypePerson();
    }



}
