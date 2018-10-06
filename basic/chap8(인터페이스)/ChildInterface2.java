package chap8;
//382p 예제 : 디폴트 메소드가 있는 인터페이스 상속

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() {/*실행문*/}
	public void method3();
}
