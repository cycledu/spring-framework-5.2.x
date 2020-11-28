package JtTest;

import org.springframework.context.annotation.Bean;

/**
 * @Author : jingtao
 * @Data : 2020/10/06/23:25
 * @Description :
 * @PageOrWebSite：
 * @Expected result ：
 */
public class info {
	private String A;
	private String B;
	public info() {
	}
	public void init(){
		//假设是从数据库中取得值
		A="a";
		B="b";
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
}
