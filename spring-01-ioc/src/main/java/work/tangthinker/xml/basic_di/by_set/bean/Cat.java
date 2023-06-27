/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 01:02:1:02
 */
package work.tangthinker.xml.basic_di.by_set.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shanliao
 * @since 2023/6/27 1:02
 * ClassPath: work.tangthinker.basic_di.by_set.bean.Cat
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {

    private String name;

    private Person master;


}
