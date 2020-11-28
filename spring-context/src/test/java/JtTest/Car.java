package JtTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;

import java.util.Date;

/**
 * @Author : jingtao
 * @Data : 2020/09/11/23:14
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class Car
		implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware
{
	String brand;
	String Color;
	Date CreateTime = new Date();
	int maxSpeed;
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Car() {
		System.out.println("constructor...进行实例化");
	}
	public Car(String brand, String color) {
		System.out.println("constructor...：进行实例化");
		this.brand = brand;
		this.Color = color;
	}
	public Car(String brand, String color, int maxSpeed) {
		this.brand = brand;
		Color = color;
		this.maxSpeed = maxSpeed;
	}
	public void setBrand(String brand) {
		System.out.println("设置属性");
		this.brand = brand;
	}
	public void setColor(String color) {
		System.out.println("设置属性");
		this.Color = color;
	}
	@Override
	public String toString() {
		return "Car{" + "brand='" + brand + '\'' + ", color='" + Color + '\'' + ", CreateTime='" + CreateTime + '\'' + ", maxSpeed=" + maxSpeed + '}';
	}

	//通过配置文件<bean>的init-method指定初始化方法
	public void init(){
		System.out.println("init...");
	}
	//通过配置文件<bean>的destory指定销毁方法
	public void destory(){
		System.out.println("destory...");
	}
	public void service(){
		System.out.println("service...");
	}
	//BeanNameAware实现方法
	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware实现方法:beanName:"+name);
	}
	//BeanFactoryAware实现方法
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware实现方法");
	}
	//InitializingBean实现方法
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet实现方法,相当于配置文件中配置的初始化方法");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean的destroy");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware的实现方法，Application中bean的生命周期多增加的一个步骤");
	}
}
