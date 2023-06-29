/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.complex_di.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 09:38:09:38
 */
package work.tangthinker.xml.complex_di.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Jon Snow
 * @since 2023/6/29 09:38
 * ClassPath: work.tangthinker.xml.complex_di.bean.ComplexDiPerson
 * Description:
 */
@Data
public class ComplexDiPerson {

    private String[] names;

    private List<String> phones;

    private Set<ComplexDiCat> pets;

    private Map<String, Object> events;

    private Properties properties;



}
