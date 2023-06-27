/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.basic_dl.with_annotation.annotation
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 22:36:22:36
 */
package work.tangthinker.xml.basic_dl.with_annotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shanliao
 * @since 2023/6/27 22:36
 * ClassPath: work.tangthinker.basic_dl.with_annotation.annotation.DriverClass
 * Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DriverClass {
}
