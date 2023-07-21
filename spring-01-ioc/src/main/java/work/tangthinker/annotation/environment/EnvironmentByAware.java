/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.environment
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-07-20 01:34:1:34
 */
package work.tangthinker.annotation.environment;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author shanliao
 * @since 2023/7/20 1:34
 * ClassPath: work.tangthinker.annotation.environment.EnvironmentByAware
 * Description:
 */
@Component
public class EnvironmentByAware implements EnvironmentAware {

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }


    public void print(){
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println("username: " + environment.getProperty("user.username"));
        System.out.println("password: " + environment.getProperty("user.password"));
    }


}
