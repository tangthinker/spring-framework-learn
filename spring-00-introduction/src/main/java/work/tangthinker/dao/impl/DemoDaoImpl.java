/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.dao.impl
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-25 15:56:15:56
 */
package work.tangthinker.dao.impl;

import work.tangthinker.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jon Snow
 * @since 2023/6/25 15:56
 * ClassPath: work.tangthinker.dao.impl.DemoDaoImpl
 * Description:
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("Jon", "Snow");
    }
}
