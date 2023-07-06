/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.base_package_classes
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-07 01:16:1:16
 */
package work.tangthinker.annotation.base_package_classes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.base_package_classes.bean.OuterClass;
import work.tangthinker.annotation.base_package_classes.bean.PackageHere;

/**
 * @author shanliao
 * @since 2023/7/7 1:16
 * ClassPath: work.tangthinker.annotation.base_package_classes.BasePackageClassesConfiguration
 * Description:
 */
@Configuration
@ComponentScan(basePackageClasses = PackageHere.class)
public class BasePackageClassesConfiguration {
}
