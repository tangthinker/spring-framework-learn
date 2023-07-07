/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.xml.property_source.property_source_factory
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-07-07 13:42:13:42
 */
package work.tangthinker.xml.property_source.property_source_factory;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Jon Snow
 * @since 2023/7/7 13:42
 * ClassPath: work.tangthinker.xml.property_source.property_source_factory.YmlPropertySourceFactory
 * Description:
 */
public class YmlPropertySourceFactory implements PropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        if (!resource.getResource().getFilename().contains(".yml")){
            PropertySourceFactory propertySourceFactory = new DefaultPropertySourceFactory();
            PropertySource<?> propertySource = propertySourceFactory.createPropertySource(name, resource);
            return propertySource;
        }
        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        yamlPropertiesFactoryBean.setResources(resource.getResource());
        Properties properties = yamlPropertiesFactoryBean.getObject();
        return new PropertiesPropertySource(name == null ? resource.getResource().getFilename() : name, properties);
    }
}
