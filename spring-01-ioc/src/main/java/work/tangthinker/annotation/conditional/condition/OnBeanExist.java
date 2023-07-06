/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.conditional.condition
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-06 18:29:18:29
 */
package work.tangthinker.annotation.conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import work.tangthinker.annotation.conditional.annotation.InjectOnBeanExist;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @author Jon Snow
 * @since 2023/7/6 18:29
 * ClassPath: work.tangthinker.annotation.conditional.condition.OnBeanExist
 * Description:
 */
public class OnBeanExist implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(InjectOnBeanExist.class.getName());
        Class<?>[] classes = (Class<?>[]) attributes.get("value");
        for (Class<?> clazz : classes) {
            if (context.getBeanFactory().getBeanProvider(clazz).getIfAvailable() == null){
                return false;
            }
        }
        String[] beanNames = (String[]) attributes.get("beanNames");
        for (String beanName : beanNames) {
            if (!context.getBeanFactory().containsBeanDefinition(beanName)){
                return false;
            }
        }
        return true;
    }
}
