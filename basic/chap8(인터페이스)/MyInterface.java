package chap8;
//381p 예제 : 디폴트 메소드와 인터페이스 확장
public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
