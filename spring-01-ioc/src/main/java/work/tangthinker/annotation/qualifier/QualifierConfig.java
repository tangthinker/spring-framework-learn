/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.qualifier
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 19:57:19:57
 */
package work.tangthinker.annotation.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import work.tangthinker.annotation.qualifier.bean.QualifierPerson;

/**
 * @author shanliao
 * @since 2023/6/28 19:57
 * ClassPath: work.tangthinker.annotation.qualifier.QualifierConfig
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.qualifier.bean")
public class QualifierConfig {


    @Bean
    @Primary
    public QualifierPerson master(){
        QualifierPerson person = new QualifierPerson();
        person.setName("master");
        person.setAge(22);
        return person;
    }



}
