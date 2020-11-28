package JtTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author : jingtao
 * @Data : 2020/10/06/23:30
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
//@Component
public class userInfo {
//	@Value("#{infoclass.A}")
	private String A;
	public userInfo() {
	}
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
//	@Value("#{infoclass.B}}")
	private String B;
	@Override
	public String toString() {
		return "userInfo{" + "A='" + A + '\'' + ", B='" + B + '\'' + '}';
	}
}
