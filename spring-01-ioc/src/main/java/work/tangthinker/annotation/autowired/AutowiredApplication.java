/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.autowired
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 16:56:16:56
 */
package work.tangthinker.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.autowired.bean.AutowiredCat;
import work.tangthinker.annotation.autowired.bean.AutowiredPerson;

/**
 * @author Jon Snow
 * @since 2023/6/28 16:56
 * ClassPath: work.tangthinker.annotation.autowired.AutowiredApplication
 * Description:
 */
public class AutowiredApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoWiredConfiguration.class);
        AutowiredPerson person = context.getBean(AutowiredPerson.class);
        System.out.println(person);

        AutowiredCat cat = context.getBean(AutowiredCat.class);
        System.out.println(cat);
    }



}
