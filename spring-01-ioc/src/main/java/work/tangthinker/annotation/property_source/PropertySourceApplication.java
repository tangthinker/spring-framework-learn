/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.property_source
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 10:37:10:37
 */
package work.tangthinker.annotation.property_source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.property_source.bean.PropertySourceUser;

/**
 * @author Jon Snow
 * @since 2023/6/28 10:37
 * ClassPath: work.tangthinker.annotation.property_source.PropertySourceApplication
 * Description:
 */
public class PropertySourceApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertySourceConfig.class);
        PropertySourceUser bean = context.getBean(PropertySourceUser.class);
        System.out.println(bean);
    }



}
