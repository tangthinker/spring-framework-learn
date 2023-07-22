/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.bean_definition_register
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-22 21:13:21:13
 */
package work.tangthinker.annotation.bean_definition_register;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author shanliao
 * @since 2023/7/22 21:13
 * ClassPath: work.tangthinker.annotation.bean_definition_register.BeanDefinitionRegisterConfiguration
 * Description:
 */
@Configuration
@Import(PersonRegister.class)
public class BeanDefinitionRegisterConfiguration {



    @Bean
    public BeanDefinitionRegisterPerson person(){
        return new BeanDefinitionRegisterPerson("king", "man");
    }

}
