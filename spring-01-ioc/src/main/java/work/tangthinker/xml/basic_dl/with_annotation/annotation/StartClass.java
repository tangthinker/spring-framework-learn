/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.basic_dl.with_annotation.annotation
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 22:29:22:29
 */
package work.tangthinker.xml.basic_dl.with_annotation.annotation;

import java.lang.annotation.*;

/**
 * @author shanliao
 * @since 2023/6/27 22:29
 * ClassPath: work.tangthinker.basic_dl.with_annotation.annotation.StartClass
 * Description:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface StartClass {
}
