/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.module_import.register
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-05 12:56:12:56
 */
package work.tangthinker.annotation.module_import.register;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import work.tangthinker.annotation.module_import.bean.Waiter;

/**
 * @author Jon Snow
 * @since 2023/7/5 12:56
 * ClassPath: work.tangthinker.annotation.module_import.register.WaiterRegister
 * Description:
 */
public class WaiterRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("waiter", new RootBeanDefinition(Waiter.class));
    }
}
