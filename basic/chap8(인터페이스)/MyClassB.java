package chap8;
//381p 예제 : 디폴트 메소드와 인터페이스 확장

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}

}
