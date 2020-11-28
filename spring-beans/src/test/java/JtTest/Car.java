package JtTest;

import java.util.Date;

/**
 * @Author : jingtao
 * @Data : 2020/09/11/23:14
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class Car {
	String brand;
	String color;
	Date CreateTime = new Date();
	int maxSpeed;
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Car() {
	}
	public Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car{" + "brand='" + brand + '\'' + ", color='" + color + '\'' + ", CreateTime='" + CreateTime + '\'' + ", maxSpeed=" + maxSpeed + '}';
	}
}
