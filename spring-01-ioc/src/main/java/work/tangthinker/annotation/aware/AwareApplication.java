/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.aware
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 10:11:10:11
 */
package work.tangthinker.annotation.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Jon Snow
 * @since 2023/6/29 10:11
 * ClassPath: work.tangthinker.annotation.aware.AwareApplication
 * Description:
 */
public class AwareApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        SpringContextUtils springContextUtils = context.getBean(SpringContextUtils.class);
        springContextUtils.printBeansName();
        System.out.println("this bean name is " + springContextUtils.getBeanName());
    }


}
