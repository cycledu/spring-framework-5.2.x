package JtTest.test;

import JtTest.Car;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : jingtao
 * @Data : 2020/10/06/23:42
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class lifeCycleTest {
	@Test
	public void main() {
		ApplicationContext context = new ClassPathXmlApplicationContext("JtTest/lifeCycle.xml");
		Car car1 = (Car) context.getBean("car1");
		System.out.println(car1);
		((ClassPathXmlApplicationContext) context).close();
	}
}
