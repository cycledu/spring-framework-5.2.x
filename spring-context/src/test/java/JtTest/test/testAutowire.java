package JtTest.test;

import JtTest.bean.A;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : jingtao
 * @Data : 2020/10/28/20:40
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class testAutowire {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("JtTest/testAutowire.xml");
		A a = (A) context.getBean("a");
		a.method();
		System.out.println(a.getB());

	}
}
