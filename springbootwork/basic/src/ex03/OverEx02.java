package ex03;

//완성품
class Engine{

}

//소나타 (x - 다형성 성립안함)
class Sonata extends Engine{
	
}

//완성품
class Burger{
	
}

//치즈버거
class CheeseBuger extends Burger{
	
}

//객체지향 두번째원칙 : 상속은 다형성을 성립해야한다.


public class OverEx02 {
	public static void main(String[] args) {
		CheeseBuger c1 = new CheeseBuger(); //CheeseBuger, Burger
		Burger c2 = new CheeseBuger();
		
				
	}
}
