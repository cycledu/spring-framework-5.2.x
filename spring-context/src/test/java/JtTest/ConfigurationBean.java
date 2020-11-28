package JtTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : jingtao
 * @Data : 2020/09/23/22:41
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：基于注解的配置方式
 */
@Configuration
public class ConfigurationBean {

	@Bean(name = "confBean",initMethod ="init",destroyMethod = "destory")
	public Car getCar(){
		Car car = new Car();
		car.setBrand("大众");
		car.setColor("蓝色");
		car.setMaxSpeed(200);
		return car;
	}
}
