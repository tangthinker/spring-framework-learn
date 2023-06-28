/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.qualifier
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 19:53:19:53
 */
package work.tangthinker.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.qualifier.bean.QualifierCat;

/**
 * @author shanliao
 * @since 2023/6/28 19:53
 * ClassPath: work.tangthinker.annotation.qualifier.QualifierApplication
 * Description:
 */
public class QualifierApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QualifierConfig.class);
        QualifierCat cat = context.getBean(QualifierCat.class);
        System.out.println(cat);

    }



}
