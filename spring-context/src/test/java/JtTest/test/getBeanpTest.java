package JtTest.test;

import JtTest.Car;
import JtTest.userInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : jingtao
 * @Data : 2020/10/06/23:38
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
//bean获取其他bean在初始化方法获得的属性值
public class getBeanpTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:JtTest/beans.xml");
		userInfo useinfo = (userInfo) context.getBean("useinfo");
		System.out.println(useinfo);
	}
}
