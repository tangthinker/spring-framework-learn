/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.environment
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-20 01:37:1:37
 */
package work.tangthinker.annotation.environment;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author shanliao
 * @since 2023/7/20 1:37
 * ClassPath: work.tangthinker.annotation.environment.EnvironmentConfiguration
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.environment")
@PropertySource("classpath:basic_di/properties/property-source-user-value.properties")
public class EnvironmentConfiguration {
}
