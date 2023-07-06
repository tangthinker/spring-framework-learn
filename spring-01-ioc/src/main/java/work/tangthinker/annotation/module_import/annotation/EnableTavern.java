/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.module_import.annotation
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-05 12:39:12:39
 */
package work.tangthinker.annotation.module_import.annotation;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import work.tangthinker.annotation.module_import.bean.Boss;
import work.tangthinker.annotation.module_import.config.BartenderConfiguration;
import work.tangthinker.annotation.module_import.register.WaiterRegister;
import work.tangthinker.annotation.module_import.selector.BarImportSelector;

import java.lang.annotation.*;

/**
 * @author Jon Snow
 * @since 2023/7/5 12:39
 * ClassPath: work.tangthinker.annotation.module_import.annotation.EnableTavern
 * Description:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegister.class})
public @interface EnableTavern {
}
