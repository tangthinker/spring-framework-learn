/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.bean_definition
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-22 20:44:20:44
 */
package work.tangthinker.annotation.bean_definition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shanliao
 * @since 2023/7/22 20:44
 * ClassPath: work.tangthinker.annotation.bean_definition.BeanDefinitionApplication
 * Description:
 *
 * Generic bean: class [work.tangthinker.annotation.bean_definition.BeanDefinitionPerson];
 *  scope=singleton;
 * abstract=false;
 * lazyInit=null;
 * autowireMode=0;
 * dependencyCheck=0;
 * autowireCandidate=true;
 * primary=false;
 * factoryBeanName=null;
 * factoryMethodName=null;
 * initMethodName=null;
 * destroyMethodName=null;
 * defined in file [D:\IdeaProjects\spring-framework-learn\spring-01-ioc\target\classes\work\tangthinker\annotation\bean_definition\BeanDefinitionPerson.class]
 *
 * Root bean: class [null];
 * scope=;
 * abstract=false;
 * lazyInit=null;
 * autowireMode=3;
 * dependencyCheck=0;
 * autowireCandidate=true;
 * primary=false;
 * factoryBeanName=beanDefinitionConfiguration;
 * factoryMethodName=getPerson;
 * initMethodName=null;
 * destroyMethodName=(inferred);
 * defined in work.tangthinker.annotation.bean_definition.BeanDefinitionConfiguration
 */
public class BeanDefinitionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanDefinitionConfiguration.class);
        BeanDefinition beanDefinitionPerson = applicationContext.getBeanDefinition("beanDefinitionPerson");
        System.out.println(beanDefinitionPerson);
        System.out.println("================================================");
        BeanDefinition person = applicationContext.getBeanDefinition("person");
        System.out.println(person);
    }



}
