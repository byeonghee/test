package command;
//interface 여도 됨
//=========================command pattern===========
abstract class Command{//틀 제공
	abstract public void run();
}
class ACommand extends Command{
	//명령행 매개변수 a A 입력
	public void run(){
		System.out.println("ACommand실행");
	}
}
class BCommand extends Command{
	public void run(){
		System.out.println("BCommand 실행");
	}
}
//==================================
//=========factory method pattern==========입력값 - command 결정 권한
class CommandFactory{
	public Command getCommand(String name){
		Command c = null;
		if(name.equalsIgnoreCase("a")){
			c = new ACommand();
		}else if(name.equalsIgnoreCase("b")){
			c = new BCommand();
		}
		return c;
	}
}
public class CommandTest {
	public static void main(String[] args) {
		CommandFactory factory = new CommandFactory();
		Command c = factory.getCommand(args[0]);
		c.run();
		//새로 객체 생성x : 기존 생성 같은 파입 객체 재사용
		
	}
}
