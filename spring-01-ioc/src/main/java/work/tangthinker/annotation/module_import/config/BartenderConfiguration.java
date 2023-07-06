/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.module_import.config
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-05 12:45:12:45
 */
package work.tangthinker.annotation.module_import.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.module_import.bean.Bartender;

/**
 * @author Jon Snow
 * @since 2023/7/5 12:45
 * ClassPath: work.tangthinker.annotation.module_import.config.BartenderConfiguration
 * Description:
 */
@Configuration
public class BartenderConfiguration {

    @Bean
    public Bartender shanliao(){
        return new Bartender("shanliao");
    }

    @Bean
    public Bartender king(){
        return new Bartender("king");
    }

}
