package chap9;

//397P. 예제
public class A2 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1=10;
			method1();
			
			field2=10;
			method2();
		}
	}
	
	static class C{
		void method() {
			//클래스보다 클래스의 인스턴스 필드가 먼저 존재할 수 없다는 것을 기억하면 된다.
			//field1 = 10;
			//method1();
			
			field2=10;
			method2();
		}
	}
}
