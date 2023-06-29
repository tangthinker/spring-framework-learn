/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.delay_inject
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 10:22:10:22
 */
package work.tangthinker.annotation.delay_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.delay_inject.bean.DelayInjectCat;

/**
 * @author Jon Snow
 * @since 2023/6/29 10:22
 * ClassPath: work.tangthinker.annotation.delay_inject.DelayInjectApplication
 * Description:
 */
public class DelayInjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("work.tangthinker.annotation.delay_inject.bean");
        DelayInjectCat cat = context.getBean(DelayInjectCat.class);
        System.out.println(cat);
    }


}
