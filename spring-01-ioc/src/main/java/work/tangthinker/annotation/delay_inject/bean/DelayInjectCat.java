/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.delay_inject.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 10:22:10:22
 */
package work.tangthinker.annotation.delay_inject.bean;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_it;
import lombok.Data;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/6/29 10:22
 * ClassPath: work.tangthinker.annotation.delay_inject.bean.DelayInjectCat
 * Description:
 */
@Component
@Data
public class DelayInjectCat {


    private DelayInjectPerson master;


    @Autowired
    public void setMaster(ObjectProvider<DelayInjectPerson> person){
        this.master = person.getIfAvailable(DelayInjectPerson::new);
    }


}
