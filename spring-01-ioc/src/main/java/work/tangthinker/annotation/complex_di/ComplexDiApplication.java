/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.complex_di
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 09:55:09:55
 */
package work.tangthinker.annotation.complex_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.complex_di.bean.ComplexDiPerson;


/**
 * @author Jon Snow
 * @since 2023/6/29 09:55
 * ClassPath: work.tangthinker.annotation.complex_di.ComplexDiApplication
 * Description:
 */
public class ComplexDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("work.tangthinker.annotation.complex_di.bean");
        ComplexDiPerson person = context.getBean(ComplexDiPerson.class);
        System.out.println(person);
    }


}
