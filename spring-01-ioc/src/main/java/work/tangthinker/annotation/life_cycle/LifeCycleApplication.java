/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:27:17:27
 */
package work.tangthinker.annotation.life_cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.life_cycle.bean.LifeCyclePerson;

/**
 * @author shanliao
 * @since 2023/7/1 17:27
 * ClassPath: work.tangthinker.annotation.life_cycle.LifeCycleApplication
 * Description: 从输出可以看出Jsr250规范的PostConstruct和PreDestroy的优先级比init-method和destroy-method更高
 */
public class LifeCycleApplication {

    public static void main(String[] args) {
        System.out.println("IOC容器初始化...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        LifeCyclePerson bean = context.getBean(LifeCyclePerson.class);
        System.out.println("IOC容器初始化完毕！");
        System.out.println("bean object: " + bean);

        System.out.println("IOC容器准备销毁...");
        context.close();
        System.out.println("IOC容器销毁完毕！");

    }


}
