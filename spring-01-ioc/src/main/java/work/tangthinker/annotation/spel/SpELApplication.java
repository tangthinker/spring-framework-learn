/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.spel
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 15:02:15:02
 */
package work.tangthinker.annotation.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.spel.bean.SpELCat;
import work.tangthinker.annotation.spel.bean.SpELPerson;

/**
 * @author Jon Snow
 * @since 2023/6/28 15:02
 * ClassPath: work.tangthinker.annotation.spel.SpELApplication
 * Description:
 */
public class SpELApplication {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("work.tangthinker.annotation.spel.bean");
        SpELPerson person = context.getBean(SpELPerson.class);
        SpELCat cat = context.getBean(SpELCat.class);
        System.out.println(person);
        System.out.println(cat);
    }



}
