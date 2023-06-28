/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.jsr250.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 20:36:20:36
 */
package work.tangthinker.annotation.jsr250.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author shanliao
 * @since 2023/6/28 20:36
 * ClassPath: work.tangthinker.annotation.jsr250.bean.Jsr250User
 * Description:
 */
@Component("king")
@Data
public class Jsr250User {

    private String username;

    private String password;



}
