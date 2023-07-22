/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.bean_definition_register
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-22 21:12:21:12
 */
package work.tangthinker.annotation.bean_definition_register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author shanliao
 * @since 2023/7/22 21:12
 * ClassPath: work.tangthinker.annotation.bean_definition_register.BeanDefinitionRegisterApplication
 * Description:
 */
public class BeanDefinitionRegisterApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanDefinitionRegisterConfiguration.class);
        Object shanliao = context.getBean("shanliao");
        System.out.println(shanliao);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));


    }


}
