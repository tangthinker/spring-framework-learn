/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.protocol_resolver
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 10:37:10:37
 */
package work.tangthinker.xml.protocol_resolver;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jon Snow
 * @since 2023/7/7 10:37
 * ClassPath: work.tangthinker.xml.protocol_resolver.ProtocolResolverMain
 * Description:
 */
public class ProtocolResolverMain {

    public static void main(String[] args) throws IOException {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        DataBaseConfigProtocolResolver dataBaseConfigProtocolResolver = new DataBaseConfigProtocolResolver();
        resourceLoader.addProtocolResolver(dataBaseConfigProtocolResolver);

        Resource resource = resourceLoader.getResource("database:other_file/mysql-config.properties");
        InputStreamReader inputStreamReader = new InputStreamReader(resource.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while(null != (line = bufferedReader.readLine())){
            System.out.println(line);
        }
        bufferedReader.close();

    }



}
