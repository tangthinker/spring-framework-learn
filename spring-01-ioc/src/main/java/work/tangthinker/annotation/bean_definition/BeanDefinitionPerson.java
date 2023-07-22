/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.bean_definition
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-22 20:44:20:44
 */
package work.tangthinker.annotation.bean_definition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author shanliao
 * @since 2023/7/22 20:44
 * ClassPath: work.tangthinker.annotation.bean_definition.BeanDefinitionPerson
 * Description:
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeanDefinitionPerson {

    private String username;


    @PostConstruct
    public void init(){
        System.out.println("person init!");
    }

}
