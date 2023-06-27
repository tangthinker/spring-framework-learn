/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation_and_xml.annotation_import_xml
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 00:29:0:29
 */
package work.tangthinker.annotation_and_xml.annotation_import_xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author shanliao
 * @since 2023/6/28 0:29
 * ClassPath: work.tangthinker.annotation_and_xml.annotation_import_xml.AnnotationImportXmlConfiguration
 * Description: 在注解配置的环境中引入xml配置的demo
 */
@Configuration
@ImportResource("classpath:xml-path.xml")
public class AnnotationImportXmlConfiguration {
}
