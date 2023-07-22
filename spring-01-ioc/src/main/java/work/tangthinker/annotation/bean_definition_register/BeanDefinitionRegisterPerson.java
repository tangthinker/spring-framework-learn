/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.bean_definition_register
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-22 21:12:21:12
 */
package work.tangthinker.annotation.bean_definition_register;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shanliao
 * @since 2023/7/22 21:12
 * ClassPath: work.tangthinker.annotation.bean_definition_register.BeanDefinitionRegisterPerson
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeanDefinitionRegisterPerson {

    private String name;

    private String sex;

}
