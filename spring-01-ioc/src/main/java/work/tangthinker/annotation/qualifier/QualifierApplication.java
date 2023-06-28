/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.autowired
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 16:56:16:56
 */
package work.tangthinker.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.qualifier.bean.QualifierCat;
import work.tangthinker.annotation.qualifier.bean.QualifierPerson;

/**
 * @author Jon Snow
 * @since 2023/6/28 16:56
 * ClassPath: work.tangthinker.annotation.autowired.AutowiredApplication
 * Description:
 */
public class QualifierApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QualifierConfiguration.class);
        QualifierPerson person = context.getBean(QualifierPerson.class);
        System.out.println(person);

        QualifierCat cat = context.getBean(QualifierCat.class);
        System.out.println(cat);
    }



}
