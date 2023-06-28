/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.property_source
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 10:37:10:37
 */
package work.tangthinker.annotation.property_source;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Jon Snow
 * @since 2023/6/28 10:37
 * ClassPath: work.tangthinker.annotation.property_source.PropertySourceConfig
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.property_source.bean")
@PropertySource("classpath:basic_di/properties/property-source-user-value.properties")
public class PropertySourceConfig {
}

// properties文件加载进入spring ioc容器后，会转换为Map的形式保存这些配置
// springframework在初始化时就有一些配置项，占位符的取值就是从这些配置项中取
