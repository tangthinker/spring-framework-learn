/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.static_factory
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-30 14:59:14:59
 */
package work.tangthinker.xml.static_factory;

import work.tangthinker.xml.static_factory.bean.StaticFactoryPerson;

/**
 * @author Jon Snow
 * @since 2023/6/30 14:59
 * ClassPath: work.tangthinker.xml.static_factory.PersonStaticFactory
 * Description:
 */
public class PersonStaticFactory {


    public static StaticFactoryPerson getPerson(){
        return  new StaticFactoryPerson();
    }


}
