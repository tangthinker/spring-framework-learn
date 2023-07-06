/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.profile.annotation
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-06 18:07:18:07
 */
package work.tangthinker.annotation.profile.annotation;

import org.springframework.context.annotation.Import;
import work.tangthinker.annotation.profile.config.DatabaseLogConfig;
import work.tangthinker.annotation.profile.config.SystemLogConfig;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Jon Snow
 * @since 2023/7/6 18:07
 * ClassPath: work.tangthinker.annotation.profile.annotation.EnableLog
 * Description:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Import({DatabaseLogConfig.class, SystemLogConfig.class})
public @interface EnableLog {
}
