/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.multiple_inject.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 20:17:20:17
 */
package work.tangthinker.annotation.multiple_inject.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author shanliao
 * @since 2023/6/28 20:17
 * ClassPath: work.tangthinker.annotation.multiple_inject.bean.MultipleInjectUser
 * Description:
 */
@Component("shanliao")
@Data
public class MultipleInjectUser {

    private String username;

    private String password;



}
