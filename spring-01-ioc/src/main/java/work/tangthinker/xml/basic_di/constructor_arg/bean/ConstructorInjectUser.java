/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.basic_di.constructor_arg.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 10:21:10:21
 */
package work.tangthinker.xml.basic_di.constructor_arg.bean;

import lombok.ToString;

/**
 * @author Jon Snow
 * @since 2023/6/28 10:21
 * ClassPath: work.tangthinker.xml.basic_di.constructor_arg.bean.ConstructorInjectUser
 * Description:
 */
@ToString
public class ConstructorInjectUser {

    private final String username;

    private final String password;

    public ConstructorInjectUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
