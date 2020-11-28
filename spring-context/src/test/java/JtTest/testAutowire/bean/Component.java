package JtTest.testAutowire.bean;

import org.springframework.context.annotation.Bean;

/**
 * @Author : jingtao
 * @Data : 2020/11/09/14:06
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
@org.springframework.stereotype.Component
public class Component {
	@Bean("A")
	public ABean BeanA2() {
		return new ABean("A2");
	}
	@Bean("A")
	public ABean BeanA1() {
		return new ABean("A1");
	}
	@Bean("A")
	public BBean bean() {
		return new BBean("B");
	}
	@Bean("testAutowire")
	public TestAutowireAndResource testAutowire() {
		return new TestAutowireAndResource();
	}
}
