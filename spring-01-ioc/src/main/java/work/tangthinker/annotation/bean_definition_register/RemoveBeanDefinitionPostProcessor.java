/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.bean_definition_register
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-22 21:18:21:18
 */
package work.tangthinker.annotation.bean_definition_register;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

/**
 * @author shanliao
 * @since 2023/7/22 21:18
 * ClassPath: work.tangthinker.annotation.bean_definition_register.RemoveBeanDefinitionPostProcessor
 * Description:
 */
@Component
public class RemoveBeanDefinitionPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
        for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
            if (beanDefinitionName.equals("person")){
                registry.removeBeanDefinition(beanDefinitionName);
            }
        }
    }
}
