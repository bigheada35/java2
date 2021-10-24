/*
결과 : 
	 p.x = 100
	Child Method	 
	
	c.x = 200
	Child Method
 */
public class Ex7_20 {

	public static void main(String[] args) {
		// 주의 : 자동 타입 변환 ( promoion ) 
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		// 주의 : 자동 타입 변환 ( promoion ) 
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}

}

class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}
