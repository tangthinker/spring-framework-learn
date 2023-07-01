/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.life_cycle.prototype.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-01 17:48:17:48
 */
package work.tangthinker.annotation.life_cycle.prototype.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author shanliao
 * @since 2023/7/1 17:48
 * ClassPath: work.tangthinker.annotation.life_cycle.prototype.bean.PrototypePerson
 * Description:
 */
public class PrototypePerson implements InitializingBean, DisposableBean {

    public void initMethod(){
        System.out.println("init-method");
    }

    public void destroyMethod(){
        System.out.println("destroy-method");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct");
    }


    @PreDestroy
    public void PreDestroy(){
        System.out.println("preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet");
    }
}
