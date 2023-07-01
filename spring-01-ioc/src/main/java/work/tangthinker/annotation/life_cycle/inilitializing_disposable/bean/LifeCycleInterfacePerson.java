/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle.inilitializing_disposable.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:40:17:40
 */
package work.tangthinker.annotation.life_cycle.inilitializing_disposable.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author shanliao
 * @since 2023/7/1 17:40
 * ClassPath: work.tangthinker.annotation.life_cycle.inilitializing_disposable.bean.LifeCycleInterfacePerson
 * Description:
 */
public class LifeCycleInterfacePerson implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("bean 被销毁了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean 被初始化并设置参数了");
    }
}
