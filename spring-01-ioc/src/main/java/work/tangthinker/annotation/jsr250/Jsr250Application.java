/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.jsr250
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 20:30:20:30
 */
package work.tangthinker.annotation.jsr250;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work.tangthinker.annotation.jsr250.bean.Jsr250Manager;

/**
 * @author shanliao
 * @since 2023/6/28 20:30
 * ClassPath: work.tangthinker.annotation.jsr250.Jsr250Application
 * Description:
 * JSR 全称 Java Specification Requests，是Java语言的一个开发规范
 * 定制它的组织叫做JCP Java Community Process
 *
 * 主要使用到的注解为
 * _@Resource  其与@Autowired作用相似，不过Resource是按名称byName的方式注入，而@Autowired是按类型byType方式注入
 * _@Inject + @Named Inject和Autowired作用一致
 */
public class Jsr250Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Jsr250Config.class);
        Jsr250Manager bean = context.getBean(Jsr250Manager.class);
        System.out.println(bean);


    }



}
