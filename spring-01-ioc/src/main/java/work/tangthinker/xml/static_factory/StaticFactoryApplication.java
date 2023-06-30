/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.static_factory
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-30 14:57:14:57
 */
package work.tangthinker.xml.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.static_factory.bean.StaticFactoryPerson;

/**
 * @author Jon Snow
 * @since 2023/6/30 14:57
 * ClassPath: work.tangthinker.xml.static_factory.StaticFactoryApplication
 * Description:
 */
public class StaticFactoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_di/static-factory.xml");
        context.getBeansOfType(StaticFactoryPerson.class).forEach((id, object) -> {
            System.out.println(id + ":" + object);
        });


    }



}
