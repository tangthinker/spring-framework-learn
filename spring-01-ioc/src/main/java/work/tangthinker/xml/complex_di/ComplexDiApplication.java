/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.complex_di
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 09:38:09:38
 */
package work.tangthinker.xml.complex_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.complex_di.bean.ComplexDiPerson;

/**
 * @author Jon Snow
 * @since 2023/6/29 09:38
 * ClassPath: work.tangthinker.xml.complex_di.ComplexDiApplication
 * Description:
 */
public class ComplexDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("complex_di/complex-di.xml");
        ComplexDiPerson person = context.getBean(ComplexDiPerson.class);
        System.out.println(person);
    }


}
