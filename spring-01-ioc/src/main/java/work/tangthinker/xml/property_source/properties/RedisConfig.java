/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.property_source.properties
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 13:36:13:36
 */
package work.tangthinker.xml.property_source.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/7/7 13:36
 * ClassPath: work.tangthinker.xml.property_source.properties.RedisConfig
 * Description:
 */
@Component
@Data
public class RedisConfig {

    @Value("${redis.username}")
    private String username;

    @Value("${redis.password}")
    private String password;

    @Value("${redis.url}")
    private String url;

}
