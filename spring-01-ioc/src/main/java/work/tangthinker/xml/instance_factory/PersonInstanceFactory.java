/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.instance_factory
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-30 15:07:15:07
 */
package work.tangthinker.xml.instance_factory;

import work.tangthinker.xml.instance_factory.bean.InstanceFactoryPerson;

/**
 * @author Jon Snow
 * @since 2023/6/30 15:07
 * ClassPath: work.tangthinker.xml.instance_factory.PersonInstanceFactory
 * Description:
 */
public class PersonInstanceFactory {

    public InstanceFactoryPerson getPerson(){
        return new InstanceFactoryPerson();
    }


}
