/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-25 18:44:18:44
 */
package work.tangthinker;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.bean.Person;

/**
 * @author Jon Snow
 * @since 2023/6/25 18:44
 * ClassPath: work.tangthinker.QuickstartApplication
 * Description:
 */
public class QuickstartApplication {


    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/quickstart_byname.xml");
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }


}
