/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle.inilitializing_disposable
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:39:17:39
 */
package work.tangthinker.annotation.life_cycle.inilitializing_disposable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.life_cycle.inilitializing_disposable.bean.LifeCycleInterfacePerson;

/**
 * @author shanliao
 * @since 2023/7/1 17:39
 * ClassPath: work.tangthinker.annotation.life_cycle.inilitializing_disposable.LifeCycleInterfaceApplication
 * Description:
 * 初始化方法的优先级：@PostConstruct → InitializingBean → init-method
 * Jsr250优先级最高、Spring的接口优先级比init-method优先级高
 */
public class LifeCycleInterfaceApplication {

    public static void main(String[] args) {
        System.out.println("IOC容器初始化...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleInterfaceConfig.class);
        LifeCycleInterfacePerson bean = context.getBean(LifeCycleInterfacePerson.class);
        System.out.println("IOC容器初始化完毕！");
        System.out.println("bean object: " + bean);

        System.out.println("IOC容器准备销毁...");
        context.close();
        System.out.println("IOC容器销毁完毕！");
    }



}
