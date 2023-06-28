/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.basic_di.constructor_arg
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 10:20:10:20
 */
package work.tangthinker.xml.basic_di.constructor_arg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.basic_di.constructor_arg.bean.ConstructorInjectUser;

/**
 * @author Jon Snow
 * @since 2023/6/28 10:20
 * ClassPath: work.tangthinker.xml.basic_di.constructor_arg.ConstuctorArgApplication
 * Description:
 */
public class ConstructorArgApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_di/constructor-arg.xml");
        ConstructorInjectUser constructorInjectUser = context.getBean(ConstructorInjectUser.class);
        System.out.println(constructorInjectUser);
    }



}
