package chap8;
//382p 예제 : 디폴트 메소드가 있는 인터페이스 상속
public interface ParentInterface {
	public void method1();
	public default void method2() {/*실행문*/};
}
