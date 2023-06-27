/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation_config
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 23:27:23:27
 */
package work.tangthinker.annotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.xml.basic_di.by_set.bean.Cat;
import work.tangthinker.xml.basic_di.by_set.bean.Person;

/**
 * @author shanliao
 * @since 2023/6/27 23:27
 * ClassPath: work.tangthinker.annotation_config.AnnotationConfigApplication
 * Description:
 */
public class AnnotationConfigApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Person person = applicationContext.getBean(Person.class);
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(person);
        System.out.println(cat);
    }



}
