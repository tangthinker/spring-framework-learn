/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.lazy_look_up
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 23:05:23:05
 */
package work.tangthinker.xml.lazy_look_up;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.basic_di.by_set.bean.Cat;
import work.tangthinker.xml.basic_di.by_set.bean.Person;
/**
 * @author shanliao
 * @since 2023/6/27 23:05
 * ClassPath: work.tangthinker.lazy_look_up.ImmediatlyLookUpApplication
 * Description:
 */
public class ImmediatlyLookUpApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/by-name.xml");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        // 使用try-catch的方式解决找不到bean的方案不优雅且性能差
        Cat cat;
        try {
            cat = applicationContext.getBean(Cat.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println(e.getMessage());
            cat = new Cat();
        }
        System.out.println(cat);
    }



}
