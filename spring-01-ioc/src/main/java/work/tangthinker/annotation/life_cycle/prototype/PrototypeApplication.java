/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle.prototype
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:48:17:48
 */
package work.tangthinker.annotation.life_cycle.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.config.AnnotationConfigApplication;
import work.tangthinker.annotation.life_cycle.prototype.bean.PrototypePerson;

/**
 * @author shanliao
 * @since 2023/7/1 17:48
 * ClassPath: work.tangthinker.annotation.life_cycle.prototype.PrototypeApplication
 * Description:
 * 从输出可以看出：
 * 1. 原型bean不随IOC容器初始化而初始化，这与单例bean随IOC容器初始化而初始化不同
 * 2. 原型bean不会随IOC容器销毁而被销毁，需要手动调用destroyBean方法销毁
 * 3. 原型bean的生命周期回调中不会只需destroy-method方法
 */
public class PrototypeApplication {

    public static void main(String[] args) {
        System.out.println("IOC容器初始化...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrototypeConfig.class);
        System.out.println("IOC容器初始化完毕！");
        PrototypePerson bean = context.getBean(PrototypePerson.class);
        System.out.println("bean object: " + bean);

        System.out.println("销毁bean...");
        context.getBeanFactory().destroyBean(bean);
        System.out.println("销毁bean完成！");

        System.out.println("IOC容器准备销毁...");
        context.close();
        System.out.println("IOC容器销毁完毕！");

    }



}
