/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.property_source
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 13:19:13:19
 */
package work.tangthinker.xml.property_source;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.PropertySourceFactory;
import work.tangthinker.xml.property_source.property_source_factory.YmlPropertySourceFactory;

/**
 * @author Jon Snow
 * @since 2023/7/7 13:19
 * ClassPath: work.tangthinker.xml.property_source.PropertySourceConfig
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.xml.property_source")
@PropertySource(value = {"classpath:property_source/jdbc.properties",
                "classpath:property_source/oracle_config.xml",
                "classpath:property_source/redis-config.yml"},
            factory = YmlPropertySourceFactory.class)
public class PropertySourceConfig {
}
