/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.factory_bean.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-30 14:51:14:51
 */
package work.tangthinker.annotation.factory_bean.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Jon Snow
 * @since 2023/6/30 14:51
 * ClassPath: work.tangthinker.annotation.factory_bean.bean.PersonFactory
 * Description:
 */
@Component
public class PersonFactory implements FactoryBean<FactoryBeanPerson> {
    @Override
    public FactoryBeanPerson getObject() throws Exception {
        return new FactoryBeanPerson();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanPerson.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
