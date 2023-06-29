/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.aware
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 10:14:10:14
 */
package work.tangthinker.annotation.aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jon Snow
 * @since 2023/6/29 10:14
 * ClassPath: work.tangthinker.annotation.aware.AwareConfig
 * Description:
 */
@Configuration
public class AwareConfig {

    @Bean
    public SpringContextUtils springContextUtils(){
        return new SpringContextUtils();
    }


}
