package chap8;
//382p 예제 : 디폴트 메소드가 있는 인터페이스 상속

public interface ChildInterface3 extends ParentInterface {

	@Override
	public void method2(); //추상 메소드로 오버라이딩
	public void method3();
	
}
