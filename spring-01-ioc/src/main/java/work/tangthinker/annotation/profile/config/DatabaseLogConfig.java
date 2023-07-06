/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.profile.config
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-06 18:08:18:08
 */
package work.tangthinker.annotation.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.profile.bean.DatabaseLogAdvice;

/**
 * @author Jon Snow
 * @since 2023/7/6 18:08
 * ClassPath: work.tangthinker.annotation.profile.config.DatabaseLogConfig
 * Description:
 */
@Configuration
public class DatabaseLogConfig {

    @Bean
    public DatabaseLogAdvice databaseLogAdvice(){
        return new DatabaseLogAdvice();
    }


}
