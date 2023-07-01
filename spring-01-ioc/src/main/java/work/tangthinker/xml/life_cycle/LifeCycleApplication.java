/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.xml.life_cycle
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:16:17:16
 */
package work.tangthinker.xml.life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.life_cycle.bean.LifeCyclePerson;

/**
 * @author shanliao
 * @since 2023/7/1 17:16
 * ClassPath: work.tangthinker.xml.life_cycle.LifeCycleApplication
 * Description:
 */
public class LifeCycleApplication {

    public static void main(String[] args) {

        System.out.println("初始化IOC容器...");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("life_cycle/life-cycle.xml");
        LifeCyclePerson bean = context.getBean(LifeCyclePerson.class);
        System.out.println("IOC容器初始化完成！");
        System.out.println("bean object: " + bean);

        System.out.println("准备销毁IOC容器...");
        context.close();
        System.out.println("IOC容器已销毁！");


    }



}
