/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.conditional.annotation
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-06 18:27:18:27
 */
package work.tangthinker.annotation.conditional.annotation;

import org.springframework.context.annotation.Conditional;
import work.tangthinker.annotation.conditional.condition.OnBeanExist;

import java.lang.annotation.*;

/**
 * @author Jon Snow
 * @since 2023/7/6 18:27
 * ClassPath: work.tangthinker.annotation.conditional.annotation.InjectOnBeanExist
 * Description:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnBeanExist.class)
public @interface InjectOnBeanExist {

    Class<?>[] value() default {};

    String[] beanNames() default {};



}
