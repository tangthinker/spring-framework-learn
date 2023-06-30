/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.instance_factory
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-30 15:06:15:06
 */
package work.tangthinker.xml.instance_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.instance_factory.bean.InstanceFactoryPerson;

import java.util.Map;

/**
 * @author Jon Snow
 * @since 2023/6/30 15:06
 * ClassPath: work.tangthinker.xml.instance_factory.InstanceFactoryApplication
 * Description:
 */
public class InstanceFactoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_di/instance-factory.xml");
        Map<String, InstanceFactoryPerson> personMap = context.getBeansOfType(InstanceFactoryPerson.class);
        personMap.forEach((id, object) -> {
            System.out.println(id + ":" + object);
        });

        System.out.println("factoryBean:" + context.getBean(PersonInstanceFactory.class));
    }


}
