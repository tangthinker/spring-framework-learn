/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.dao
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-25 15:56:15:56
 */
package work.tangthinker.dao;

import java.util.List;

/**
 * @author Jon Snow
 * @since 2023/6/25 15:56
 * ClassPath: work.tangthinker.dao.DemoDao
 * Description:
 */
public interface DemoDao {

    List<String> findAll();

}
