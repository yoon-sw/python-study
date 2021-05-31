package ex03;

import lombok.Data;

// 인터페이스 = 통로
//1. new 할수없다
//2. 추상메서드를 가진다(몸체없음)
//3. abstract 키워드가 생략 가능하다.
//4. implements
//5. 함수를 오버라이드 해야하는 강제성 부여
interface Animal {
	abstract int getHp();	
	void setHp(int hp);	
	int getAttack() ;	
	void setAttack(int attack);	
	String getName();	
	void setName(String name);
}

// @Data get set 따로 정의 안해도 됨
@Data
class Dog implements Animal{
	String name = "개";
	int hp = 100;
	int attack = 10;
	
	
}

@Data
class Cat implements Animal{
	String name = "고양이";
	int hp = 100;
	int attack = 5;
	
}

@Data
class Tiger implements Animal{
	String name = "호랑이";
	int hp = 100;
	int attack = 50;
	
}

@Data
class Cow implements Animal{
	String name = "소";
	int hp = 100;
	int attack = 20;
	
	
}


public class OverEx01 {
	//강아지 -> 고양이
	static void start(Animal a1, Animal a2) {
		a2.setHp(a2.getHp() - a1.getAttack());
		System.out.println(a2.getName() + "의 HP:"+ a2.getHp());
	}
	
	public static void main(String[] args) {
		Animal d1 = new Dog(); 
		Animal d2 = new Dog();
		Animal c1 = new Cat();
		Animal cw1 = new Cow();
		
		start(d1, c1);
		start(c1, d1);
		start(d1, d2);
		start(cw1, d2);
		start(cw1, c1);
	}
}