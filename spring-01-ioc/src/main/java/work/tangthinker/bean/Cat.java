/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 01:02:1:02
 */
package work.tangthinker.bean;

import lombok.Data;

/**
 * @author shanliao
 * @since 2023/6/27 1:02
 * ClassPath: work.tangthinker.bean.Cat
 * Description:
 */
@Data
public class Cat {

    private String name;

    private Person master;


}
