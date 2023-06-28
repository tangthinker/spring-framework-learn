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
 * Autowired注入逻辑：
 * 首先将属性的类型在IOC容器中进行查找，如果找到了且只找到一个，直接返回；
 * 如果找到找到多个，则将属性名称与Bean的id进行逐个比对，如果有相同的，则直接返回；
 * 如果没有相同的，抛出NoUniqueBeanDefinitionException的异常。
 *
 * 开发中可使用Qualifier或者Primary注解规避这样的问题
 */
public class QualifierApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(QualifierConfig.class);
        QualifierCat cat = context.getBean(QualifierCat.class);
        System.out.println(cat);

    }



}
