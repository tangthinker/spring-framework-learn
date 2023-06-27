/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-25 18:44:18:44
 */
package work.tangthinker.xml.basic_dl.by_name_or_type;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.basic_dl.by_name_or_type.bean.Person;


/**
 * @author Jon Snow
 * @since 2023/6/25 18:44
 * ClassPath: work.tangthinker.basic_dl.by_name_or_type.QuickstartApplication
 * Description:
 */
public class QuickstartApplication {


    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/by-name.xml");
        Person person = (Person) beanFactory.getBean("person");
        Person person_type_1 = beanFactory.getBean(Person.class);
        System.out.println("Create bean by type-beanFactory_1: " + person_type_1);
        System.out.println("Create bean by name: " + person);

        BeanFactory beanFactory_type = new ClassPathXmlApplicationContext("basic_dl/by-type.xml");
        Person person_type = beanFactory_type.getBean(Person.class);
        System.out.println("Create bean by type:" + person_type);

    }


}
