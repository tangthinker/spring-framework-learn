/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.jsr250
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 20:41:20:41
 */
package work.tangthinker.annotation.jsr250;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.jsr250.bean.Jsr250User;

/**
 * @author shanliao
 * @since 2023/6/28 20:41
 * ClassPath: work.tangthinker.annotation.jsr250.Jsr250Config
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.jsr250.bean")
public class Jsr250Config {


    @Bean
    public Jsr250User shanliao(){
        Jsr250User user = new Jsr250User();
        user.setUsername("shanliao");
        user.setPassword("333");
        return user;
    }


}
