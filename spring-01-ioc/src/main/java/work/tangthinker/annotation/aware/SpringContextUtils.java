/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.aware
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 10:11:10:11
 */
package work.tangthinker.annotation.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.NamedBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * @author Jon Snow
 * @since 2023/6/29 10:11
 * ClassPath: work.tangthinker.annotation.aware.SpringContextUtils
 * Description: 回调注入：回调注入ApplicationContext和Bean的id
 */
public class SpringContextUtils implements ApplicationContextAware, BeanNameAware, NamedBean {

    private ApplicationContext context;
    private String beanName;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }


    public void printBeansName(){
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
    }


    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public String getBeanName() {
        return beanName;
    }
}
