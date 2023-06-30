/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.factory_bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-30 14:49:14:49
 */
package work.tangthinker.annotation.factory_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.factory_bean.bean.FactoryBeanPerson;

/**
 * @author Jon Snow
 * @since 2023/6/30 14:49
 * ClassPath: work.tangthinker.annotation.factory_bean.FactoryBeanApplication
 * Description:
 */
public class FactoryBeanApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        FactoryBeanPerson person = context.getBean(FactoryBeanPerson.class);
        System.out.println(person);

    }



}
