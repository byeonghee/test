package tv2;
interface TV{
	public void powerOn();
	public void powerOff();
	public void volumeUp();
	public void volumeDown();
}
class SamsungTV implements TV{
	public void powerOn(){
		System.out.println("삼성tv:전원켜다");
	}
	public void powerOff(){
		System.out.println("삼성tv:전원끄다");
	}
	public void volumeUp(){
		System.out.println("삼성tv:볼륨올리다");
	}
	public void volumeDown(){
		System.out.println("삼성tv:볼륨내리다");
	}
}
class LgTV implements TV{
	public void powerOn(){
		System.out.println("엘지tv:전원켜다");
	}
	public void powerOff(){
		System.out.println("엘지tv:전원끄다");
	}
	public void volumeUp(){
		System.out.println("엘지tv:볼륨올리다");
	}
	public void volumeDown(){
		System.out.println("엘지tv:볼륨내리다");
	}
}
class TVFactory{
	public static TV getTV(String brand){
		TV tv = null;
		if(brand.equals("samsung")){
			tv = new SamsungTV();
		}else if(brand.equals("lg")){
			tv = new LgTV();
		}
		return tv;
	}
}
// Main - factory 결과만 리턴
public class TVCommandFactoryUser {
	public static void main(String[] args) {
		TV tv = TVFactory.getTV(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
