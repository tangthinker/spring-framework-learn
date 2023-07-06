/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.conditional.config
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-06 18:36:18:36
 */
package work.tangthinker.annotation.conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.conditional.annotation.InjectOnBeanExist;
import work.tangthinker.annotation.conditional.bean.MysqlDataSource;
import work.tangthinker.annotation.conditional.bean.MysqlDriver;

/**
 * @author Jon Snow
 * @since 2023/7/6 18:36
 * ClassPath: work.tangthinker.annotation.conditional.config.ConditionalConfig
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.conditional.bean")
public class ConditionalConfig {

    @Bean
    @InjectOnBeanExist(MysqlDriver.class)
    public MysqlDataSource mysqlDataSource(){
        return new MysqlDataSource();
    }

}
