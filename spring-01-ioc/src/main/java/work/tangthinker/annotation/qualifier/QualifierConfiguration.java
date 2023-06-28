/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.autowired
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 16:56:16:56
 */
package work.tangthinker.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import work.tangthinker.annotation.qualifier.bean.QualifierCat;
import work.tangthinker.annotation.qualifier.bean.QualifierPerson;

/**
 * @author Jon Snow
 * @since 2023/6/28 16:56
 * ClassPath: work.tangthinker.annotation.autowired.AutoWiredConfiguration
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.qualifier.bean")
public class QualifierConfiguration {


    @Bean
    @Primary
    public QualifierPerson master(){
        QualifierPerson person = new QualifierPerson();
        person.setName("master");
        person.setAge(22);
        return person;
    }

    @Bean
    public QualifierPerson administrator(){
        return new QualifierPerson("administrator", 52);
    }

    @Bean
    @Autowired
    @Qualifier("shanliao")
    public QualifierCat qualifierCat(QualifierPerson person){
        return new QualifierCat("black", person);
    }





}
