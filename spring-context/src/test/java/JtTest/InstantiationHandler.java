package JtTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyDescriptor;

/**
 * @Author : jingtao
 * @Data : 2020/09/24/21:00
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：https://blog.csdn.net/qq_38526573/article/details/88091702
 */
@Configuration
public class InstantiationHandler implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor-postProcessBeforeInstantiation：实例化处理器的实例化前方法");
		return null;
	}
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor-postProcessAfterInstantiation：实例化处理器的实例化后方法");
		return true;
	}
//	@Override
//	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//		System.out.println("postProcessPropertyValues");
//		return null;
//	}
}
