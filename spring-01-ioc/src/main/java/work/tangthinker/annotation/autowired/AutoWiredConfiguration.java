/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.autowired
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 16:56:16:56
 */
package work.tangthinker.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.autowired.bean.AutowiredCat;
import work.tangthinker.annotation.autowired.bean.AutowiredPerson;
import work.tangthinker.xml.basic_di.by_set.bean.Cat;

/**
 * @author Jon Snow
 * @since 2023/6/28 16:56
 * ClassPath: work.tangthinker.annotation.autowired.AutoWiredConfiguration
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.autowired.bean")
public class AutoWiredConfiguration {


    @Bean
    @Autowired
    public AutowiredCat autowiredCat(AutowiredPerson person){
        return new AutowiredCat("black", person);
    }



}
