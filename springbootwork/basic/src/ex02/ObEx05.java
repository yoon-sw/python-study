package ex02;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Zealot{
	private int attack = 10;
	private int hp = 100;
	
	public Zealot() {
		
	}
//	
//	public Zealot(int attack, int hp) {
//		this.attack = attack;
//		this.hp = hp;
//	}
//	
	
}

public class ObEx05 {
	public static void main(String[] args) {
		Zealot z1 = new Zealot(10,50);
		Zealot z2 = new Zealot(10,80);
		
		System.out.println(z1);
		System.out.println(z2);
	}
}
