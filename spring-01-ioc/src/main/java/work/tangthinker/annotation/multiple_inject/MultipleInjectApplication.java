/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.multiple_inject
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 20:17:20:17
 */
package work.tangthinker.annotation.multiple_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.multiple_inject.bean.MultipleInjectManager;

/**
 * @author shanliao
 * @since 2023/6/28 20:17
 * ClassPath: work.tangthinker.annotation.multiple_inject.MultipleInjectApplication
 * Description:
 */
public class MultipleInjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MultipleInjectConfig.class);
        MultipleInjectManager manager = context.getBean(MultipleInjectManager.class);
        System.out.println(manager);
    }



}
