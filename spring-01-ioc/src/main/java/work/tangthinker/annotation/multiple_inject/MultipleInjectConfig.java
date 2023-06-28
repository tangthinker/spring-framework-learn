/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.multiple_inject
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 20:18:20:18
 */
package work.tangthinker.annotation.multiple_inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.multiple_inject.bean.MultipleInjectUser;

/**
 * @author shanliao
 * @since 2023/6/28 20:18
 * ClassPath: work.tangthinker.annotation.multiple_inject.MultipleInjectConfig
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.multiple_inject.bean")
public class MultipleInjectConfig {

    @Bean
    public MultipleInjectUser master(){
        MultipleInjectUser user = new MultipleInjectUser();
        user.setUsername("master");
        return  user;
    }


    @Bean
    public MultipleInjectUser administrator(){
        MultipleInjectUser user = new MultipleInjectUser();
        user.setUsername("administrator");
        user.setPassword("333");
        return user;
    }



}
