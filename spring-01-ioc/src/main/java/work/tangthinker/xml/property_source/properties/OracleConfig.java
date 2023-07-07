/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.property_source.properties
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 13:29:13:29
 */
package work.tangthinker.xml.property_source.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/7/7 13:29
 * ClassPath: work.tangthinker.xml.property_source.properties.OracleConfig
 * Description:
 */
@Component
@Data
public class OracleConfig {

    @Value("${oracle.username}")
    private String username;

    @Value("${oracle.password}")
    private String password;

    @Value("${oracle.driver-class-name}")
    private String driverClassName;

    @Value("${oracle.url}")
    private String url;
}
