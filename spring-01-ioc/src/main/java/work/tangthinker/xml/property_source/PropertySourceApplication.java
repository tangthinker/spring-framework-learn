/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.property_source
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 13:18:13:18
 */
package work.tangthinker.xml.property_source;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.xml.property_source.properties.JdbcProperties;
import work.tangthinker.xml.property_source.properties.OracleConfig;
import work.tangthinker.xml.property_source.properties.RedisConfig;

/**
 * @author Jon Snow
 * @since 2023/7/7 13:18
 * ClassPath: work.tangthinker.xml.property_source.PropertySourceApplication
 * Description:
 */
public class PropertySourceApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertySourceConfig.class);
        JdbcProperties jdbcProperties = context.getBean(JdbcProperties.class);
        System.out.println(jdbcProperties);
        OracleConfig oracleConfig = context.getBean(OracleConfig.class);
        System.out.println(oracleConfig);
        RedisConfig redisConfig = context.getBean(RedisConfig.class);
        System.out.println(redisConfig);


    }


}
