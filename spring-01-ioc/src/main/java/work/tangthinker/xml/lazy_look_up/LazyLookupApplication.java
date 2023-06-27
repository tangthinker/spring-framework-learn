/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.lazy_look_up
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 23:10:23:10
 */
package work.tangthinker.xml.lazy_look_up;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.basic_di.by_set.bean.Cat;
import work.tangthinker.xml.basic_di.by_set.bean.Person;

/**
 * @author shanliao
 * @since 2023/6/27 23:10
 * ClassPath: work.tangthinker.lazy_look_up.lazyLookupApplication
 * Description:
 */
public class LazyLookupApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/by-name.xml");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        ObjectProvider<Cat> catProvider = applicationContext.getBeanProvider(Cat.class);
        Cat cat = catProvider.getIfAvailable(Cat::new);
        System.out.println(cat);
        catProvider.ifAvailable(System.out::println);

    }



}
