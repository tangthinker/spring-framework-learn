/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.property_inject
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 10:28:10:28
 */
package work.tangthinker.annotation.property_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work.tangthinker.annotation.property_inject.bean.PropertyInjectUser;

/**
 * @author Jon Snow
 * @since 2023/6/28 10:28
 * ClassPath: work.tangthinker.annotation.property_inject.PropertyInjectApplication
 * Description:
 */
public class PropertyInjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("work.tangthinker.annotation.property_inject.bean");
        PropertyInjectUser bean = context.getBean(PropertyInjectUser.class);
        System.out.println(bean);
    }


}
