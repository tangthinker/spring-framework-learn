/*
 * ProjectName: spring-framework-projects
 * PackageName: work.tangthinker.service
 * Description:
 * CreateBy: Jon Snow
 * Email: tangyubin@haizhi.com
 * CreatedTime: 2023-06-25 16:04:16:04
 */
package work.tangthinker.service;

import work.tangthinker.dao.DemoDao;
import work.tangthinker.dao.impl.DemoOracleDaoImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Jon Snow
 * @since 2023/6/25 16:04
 * ClassPath: work.tangthinker.service.BeanFactory
 * Description:
 */
public class BeanFactory {

    private static Map<String, Object> beanMap = new HashMap<>();

    private static Properties properties;


    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            throw new RuntimeException("properties initialize error!");
        }
    }



    public static Object getBean(String beanName){
        if(!beanMap.containsKey(beanName)){
            synchronized (BeanFactory.class){
                if(!beanMap.containsKey(beanName)){
                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object bean = beanClazz.newInstance();
                        beanMap.put(beanName, bean);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory not have [" + beanName + "] bean!");
                    } catch (InstantiationException | IllegalAccessException e) {
                        throw new RuntimeException("Bean [" + beanName + "] instantiation error!");
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }



}
