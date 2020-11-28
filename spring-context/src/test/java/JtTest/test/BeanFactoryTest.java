package JtTest.test;

import JtTest.AfterHandler;
import JtTest.Car;
import JtTest.InstantiationHandler;
import JtTest.MyBeanFactoryPostPocessor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * @Author : jingtao
 * @Data : 2020/09/11/23:27
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class BeanFactoryTest {
	@Test
	public void getBean() throws IOException {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource resource = resolver.getResource("classpath:JtTest/beans.xml");
		System.out.println(resource.getURL());
		BeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
		//XmlBeanDefinitionReader通过Resource装载Spring配置信息并启动IoC容器，
		reader.loadBeanDefinitions(resource);

		//向beanfactory中添加两个个处理器Processor
		((DefaultListableBeanFactory) factory).addBeanPostProcessor(new InstantiationHandler());
		((DefaultListableBeanFactory) factory).addBeanPostProcessor(new AfterHandler());
		Car car = factory.getBean("car1", Car.class);
		System.out.println(car.toString());

		//若在xml中bean设置为singleton，第二次获取bean时直接从IoC容器的缓存中获取bean实例，若设置为prototype，则返回新的实例
		System.out.println(factory.getBean("car1", Car.class).equals(car));
	}
}
