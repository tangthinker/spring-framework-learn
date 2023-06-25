/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.service.impl
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-25 15:54:15:54
 */
package work.tangthinker.service.impl;

import work.tangthinker.dao.DemoDao;
import work.tangthinker.dao.impl.DemoDaoImpl;
import work.tangthinker.service.BeanFactory;
import work.tangthinker.service.DemoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jon Snow
 * @since 2023/6/25 15:54
 * ClassPath: work.tangthinker.service.impl.DemoServiceImpl
 * Description:
 */
public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
