/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.module_import.config
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-05 12:50:12:50
 */
package work.tangthinker.annotation.module_import.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.module_import.bean.Bar;

/**
 * @author Jon Snow
 * @since 2023/7/5 12:50
 * ClassPath: work.tangthinker.annotation.module_import.config.BarConfiguration
 * Description:
 */
@Configuration
public class BarConfiguration {

    @Bean
    public Bar shanliao_bar(){
        return new Bar();
    }


}
