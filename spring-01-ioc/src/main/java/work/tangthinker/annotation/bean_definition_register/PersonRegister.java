/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.bean_definition_register
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-22 21:14:21:14
 */
package work.tangthinker.annotation.bean_definition_register;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author shanliao
 * @since 2023/7/22 21:14
 * ClassPath: work.tangthinker.annotation.bean_definition_register.PersonRegister
 * Description:
 */
public class PersonRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("shanliao",
                BeanDefinitionBuilder.genericBeanDefinition(BeanDefinitionRegisterPerson.class)
                        .addPropertyValue("name", "shanliao")
                        .getBeanDefinition());
    }
}
