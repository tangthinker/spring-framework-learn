/*
 * ProjectName: spring-framework-learn
 * PackageName: work.tangthinker.basic_dl.of_type.dao.impl
 * CreateBy: shanliao
 * Email: shanliao420@yeah.net
 * CreatedTime: 2023-06-27 01:13:1:13
 */
package work.tangthinker.xml.basic_dl.of_type.dao.impl;

import work.tangthinker.xml.basic_dl.of_type.dao.DemoDao;

/**
 * @author shanliao
 * @since 2023/6/27 1:13
 * ClassPath: work.tangthinker.basic_dl.of_type.dao.impl.DemoDaoMySQLImpl
 * Description:
 */
public class DemoDaoOracleImpl implements DemoDao {
    @Override
    public String queryName() {
        return "Oracle implementation";
    }
}
