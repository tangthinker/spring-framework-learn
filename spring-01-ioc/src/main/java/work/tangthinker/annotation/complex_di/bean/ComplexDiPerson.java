/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.annotation.complex_di.bean
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-29 09:55:09:55
 */
package work.tangthinker.annotation.complex_di.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Jon Snow
 * @since 2023/6/29 09:55
 * ClassPath: work.tangthinker.annotation.complex_di.bean.ComplexDiPerson
 * Description:
 */
@Component
@Data
public class ComplexDiPerson {

    @Value("#{new String[]{'shanliao', 'king'}}")
    private String[] names;

    @Value("#{{'10086', '10010'}}")
    private List<String> phones;

    @Value("#{{@blackCat, new work.tangthinker.annotation.complex_di.bean.ComplexDiCat()}}")
    private Set<ComplexDiCat> pets;

    @Value("#{{'8:00':'getUp', '9:00':@blackCat, '10:00':new work.tangthinker.annotation.complex_di.bean.ComplexDiCat(), '18:00':'sleep'}}")
    private Map<String, Object> events;

    @Value("#{{'sex':'male', 'age':22, 'tall':'180'}}")
    private Properties properties;



}
