package JtTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author : jingtao
 * @Data : 2020/09/23/23:37
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
//后置处理器必须在配置文件中配置
public class AfterHandler implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor-postProcessBeforeInitialization：后置处理器的初始化前方法");
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor-postProcessAfterInitialization：后置处理器的初始化后方法");
		return bean;
	}
}
