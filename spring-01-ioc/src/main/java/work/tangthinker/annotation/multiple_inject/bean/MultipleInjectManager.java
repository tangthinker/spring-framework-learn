/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.annotation.multiple_inject.bean
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-28 20:21:20:21
 */
package work.tangthinker.annotation.multiple_inject.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shanliao
 * @since 2023/6/28 20:21
 * ClassPath: work.tangthinker.annotation.multiple_inject.bean.MultipleInjectManager
 * Description:
 */
@Component
@Data
public class MultipleInjectManager {

    @Autowired
    private List<MultipleInjectUser> users;



}
