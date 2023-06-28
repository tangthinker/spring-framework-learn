/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.qualifier.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 19:54:19:54
 */
package work.tangthinker.annotation.qualifier.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shanliao
 * @since 2023/6/28 19:54
 * ClassPath: work.tangthinker.annotation.qualifier.bean.QualifierCat
 * Description:
 */
@Component
@Data
public class QualifierCat {

    @Value("black")
    private String name;

    @Autowired
    @Qualifier("shanliao")      // Qualifier不受Primary注解的干扰
    private QualifierPerson master;


}
