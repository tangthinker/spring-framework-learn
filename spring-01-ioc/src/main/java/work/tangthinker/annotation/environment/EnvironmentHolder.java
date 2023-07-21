/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.environmet
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-19 23:59:23:59
 */
package work.tangthinker.annotation.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author shanliao
 * @since 2023/7/19 23:59
 * ClassPath: work.tangthinker.annotation.environment.EnvironmentHolder
 * Description:
 */
@Component
public class EnvironmentHolder {

    @Autowired
    private Environment environment;

    public void print(){
        System.out.println(environment);
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
    }



}
