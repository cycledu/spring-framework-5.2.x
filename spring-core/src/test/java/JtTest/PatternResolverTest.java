package JtTest;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * @Author : jingtao
 * @Data : 2020/09/11/21:35
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class PatternResolverTest {
	public static void main(String[] args) {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = new Resource[0];
		try {
			//获取G:/Learn/spring-framework-5.2.x/spring-core/src/test这个目录下的多级目录中的后缀为Java的所有文件的资源
			resources = resolver.getResources("file:G:/Learn/spring-framework-5.2.x/spring-core/src/test/**/*.java");
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Resource s : resources) {
			System.out.println(s.getDescription());
		}
	}
}
