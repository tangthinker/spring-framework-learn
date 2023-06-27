/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.basic_dl.of_type
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 01:12:1:12
 */
package work.tangthinker.xml.basic_dl.of_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.tangthinker.xml.basic_dl.of_type.dao.DemoDao;

import java.util.Map;

/**
 * @author shanliao
 * @since 2023/6/27 1:12
 * ClassPath: work.tangthinker.basic_dl.of_type.OfTypeApplication
 * Description:
 */
public class OfTypeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/of-type.xml");
        Map<String, DemoDao> beans = applicationContext.getBeansOfType(DemoDao.class);
        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + ":" + bean + ":" + bean.queryName());
        });
    }


}
