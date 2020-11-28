package JtTest.testAutowire;

import JtTest.testAutowire.bean.Component;
import JtTest.testAutowire.bean.TestAutowireAndResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : jingtao
 * @Data : 2020/11/09/14:05
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Component.class);
		TestAutowireAndResource testAutowire = (TestAutowireAndResource) context.getBean("testAutowire");
		System.out.println(testAutowire.aBean.getA());

	}
}
