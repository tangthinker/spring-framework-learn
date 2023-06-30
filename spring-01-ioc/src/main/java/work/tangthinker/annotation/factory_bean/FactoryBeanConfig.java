/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.factory_bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-30 14:49:14:49
 */
package work.tangthinker.annotation.factory_bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jon Snow
 * @since 2023/6/30 14:49
 * ClassPath: work.tangthinker.annotation.factory_bean.FactoryBeanConfig
 * Description:
 */
@Configuration
@ComponentScan("work.tangthinker.annotation.factory_bean.bean")
public class FactoryBeanConfig {
}
