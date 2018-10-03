package chap9;

//400P. 예제 : 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter1 {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter1.this.field);
			Outter1.this.method();
		}
	}
}
