/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.module_import.selector
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-05 12:51:12:51
 */
package work.tangthinker.annotation.module_import.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import work.tangthinker.annotation.module_import.bean.Bar;
import work.tangthinker.annotation.module_import.config.BarConfiguration;

/**
 * @author Jon Snow
 * @since 2023/7/5 12:51
 * ClassPath: work.tangthinker.annotation.module_import.selector.BarImportSelector
 * Description:
 */
public class BarImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
