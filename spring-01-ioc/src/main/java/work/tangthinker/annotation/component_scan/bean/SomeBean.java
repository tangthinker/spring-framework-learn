/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.component_scan.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 23:42:23:42
 */
package work.tangthinker.annotation.component_scan.bean;

import org.springframework.stereotype.Component;

/**
 * @author shanliao
 * @since 2023/6/27 23:42
 * ClassPath: work.tangthinker.annotation.component_scan.bean.SomeBean
 * Description:
 */
// 如果不指定Bean名称，默认为类名的首字母小写
// 可使用Component注解的value属性设置Bean的ide
@Component("shanliao")
public class SomeBean {
}
