package proxy;

public class ProxyMain {

	public static void main(String[] args) {
		//1. RealService 호출
		/*Service s = new RealService();
		String result = s.runSomething();*/
		//2. ProxyService 비서 호출
		/*Service s = Class.forName(args[0]).newInstance();*/
		Service s = new ProxyService();
		String result = s.runSomething();
		System.out.println(result);
	}

}

//a 기능 처리 : 사전설정작업 + a + 사후추가처리작업
//b 기능 처리 : 사전설정작업 + b
//c 기능 처리 : c + 사후추가처리작업