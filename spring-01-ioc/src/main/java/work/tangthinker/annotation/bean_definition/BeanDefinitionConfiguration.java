/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.bean_definition
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-22 20:48:20:48
 */
package work.tangthinker.annotation.bean_definition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shanliao
 * @since 2023/7/22 20:48
 * ClassPath: work.tangthinker.annotation.bean_definition.BeanDefinitionConfiguration
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.bean_definition")
public class BeanDefinitionConfiguration {

    @Bean("person")
    public BeanDefinitionPerson getPerson(){
        return new BeanDefinitionPerson("shanliao");
    }



}
