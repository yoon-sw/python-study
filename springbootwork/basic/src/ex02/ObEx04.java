package ex02;

import lombok.Data;

@Data
class Animal{
	private String name;
	private int speed;
}

public class ObEx04 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.setName("사자");
		System.out.println(a.getName());
		
	}
}


