/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.autowired.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-28 16:57:16:57
 */
package work.tangthinker.annotation.qualifier.bean;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author Jon Snow
 * @since 2023/6/28 16:57
 * ClassPath: work.tangthinker.annotation.autowired.bean.AutowiredCat
 * Description:
 */
@ToString
@AllArgsConstructor
public class QualifierCat {

    private String name;

    private QualifierPerson master;



}
