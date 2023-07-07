/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.protocol_resolver
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 10:38:10:38
 */
package work.tangthinker.xml.protocol_resolver;

import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @author Jon Snow
 * @since 2023/7/7 10:38
 * ClassPath: work.tangthinker.xml.protocol_resolver.DataBaseConfigProtocolResolver
 * Description:
 */
public class DataBaseConfigProtocolResolver implements ProtocolResolver {

    public static final String DATA_BASE_CONFIG_PREFIX = "database:";


    @Override
    public Resource resolve(String location, ResourceLoader resourceLoader) {
        if (!location.startsWith(DATA_BASE_CONFIG_PREFIX)){
            return null;
        }
        String realPath = location.substring(DATA_BASE_CONFIG_PREFIX.length());
        String classPathLocation = "classpath:" + realPath;
        return resourceLoader.getResource(classPathLocation);
    }
}
