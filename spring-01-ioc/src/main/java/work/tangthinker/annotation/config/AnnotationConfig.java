/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation_config
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 23:24:23:24
 */
package work.tangthinker.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.xml.basic_di.by_set.bean.Cat;
import work.tangthinker.xml.basic_di.by_set.bean.Person;

/**
 * @author shanliao
 * @since 2023/6/27 23:24
 * ClassPath: work.tangthinker.annotation_config.AnnotationConfig
 * Description:
 */

@Configuration
public class AnnotationConfig {

    // 使用注解的方式注入bean，id为方法的方法名person，
    // 也可以设置注解的name属性设置bean的id
    @Bean
    public Person person(){
        return new Person("shanliao", 22);
    }


    @Bean(name = "cat")   // 4.3.3之后可以直接设置value属性
    public Cat noName(){
        return new Cat("black", person());
    }


}
