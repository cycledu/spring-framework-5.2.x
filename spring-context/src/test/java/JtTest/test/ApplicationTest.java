package JtTest.test;

import JtTest.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : jingtao
 * @Data : 2020/09/23/22:31
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class ApplicationTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:JtTest/beans.xml");
			Car car1 = (Car) context.getBean("car5");
		System.out.println(car1.toString());
		System.out.println(context.getBean("car2").equals(car1));
		((ClassPathXmlApplicationContext) context).close();

		//通过一个带有Configuraion的POJO的装载bean配置
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);
//		Car configurationBean = (Car) applicationContext.getBean("confBean",Car.class);
//		System.out.println(configurationBean);
//		configurationBean.service();
//		((AnnotationConfigApplicationContext) applicatio	nContext).close();
	}
}
