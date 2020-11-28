package JtTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @Author : jingtao
 * @Data : 2020/09/26/11:07
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class MyBeanFactoryPostPocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition car1 = beanFactory.getBeanDefinition("car1");
		car1.getPropertyValues().addPropertyValue("brand","luhu");
		System.out.println("MyBeanFactoryPostPocessor：BeanFactory的后置处理器，可对beanFactory进行处理");
	}
}
