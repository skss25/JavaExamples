package chap8;
//382p ���� : ����Ʈ �޼ҵ尡 �ִ� �������̽� ���

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() {/*���๮*/}
	public void method3();
}
