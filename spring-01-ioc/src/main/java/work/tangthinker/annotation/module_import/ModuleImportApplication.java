/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.module_import
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-05 12:38:12:38
 */
package work.tangthinker.annotation.module_import;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.module_import.bean.Boss;
import work.tangthinker.annotation.module_import.config.TavernConfiguration;

import java.util.stream.Stream;

/**
 * @author Jon Snow
 * @since 2023/7/5 12:38
 * ClassPath: work.tangthinker.annotation.module_import.ModuleImportApplication
 * Description:
 */
public class ModuleImportApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Boss boss = context.getBean(Boss.class);
        System.out.println(boss);
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);


    }

}
