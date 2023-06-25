/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.dao.impl
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-25 16:05:16:05
 */
package work.tangthinker.dao.impl;

import work.tangthinker.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jon Snow
 * @since 2023/6/25 16:05
 * ClassPath: work.tangthinker.dao.impl.DemoOracleDaoImpl
 * Description:
 */
public class DemoOracleDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("oracle", "database");
    }
}
