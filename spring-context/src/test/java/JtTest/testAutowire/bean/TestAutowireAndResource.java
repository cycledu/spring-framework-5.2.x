package JtTest.testAutowire.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author : jingtao
 * @Data : 2020/11/09/14:08
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class TestAutowireAndResource {

	@Resource
	public ABean aBean;

}
