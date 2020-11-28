package JtTest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author : jingtao
 * @Data : 2020/09/10/23:46
 * @Description :
 * @PageOrWebSite：P86
 * @Expected result ：
 */
public class FileSourceExample {
	public static void main(String[] args) {
		try {

			String filePath = "G:\\Learn\\spring-framework-5.2.x\\spring-core\\src\\test\\resources\\file";
			//1、使用系统文件路径方式加载文件
			PathResource res1 = new PathResource(filePath);

			//2、使用类路径方式加载文件
			ClassPathResource res2 = new ClassPathResource("file");

			//3、使用WritableResource接口读资源文件
			OutputStream stream1 = res1.getOutputStream();
			stream1.write("AAAaa2啊啊啊".getBytes());
			stream1.close();

			//使用Resource接口读资源文件
			InputStream ins1 = res1.getInputStream();
			//InputStream ins2 = res2.getInputStream();

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int i;
			while ((i = ins1.read()) != -1) {
				baos.write(i);
			}
			System.out.println(baos.toString());
			System.out.println("res1:" + res1.getFilename());
			System.out.println("res2:" + res2.getFilename());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
