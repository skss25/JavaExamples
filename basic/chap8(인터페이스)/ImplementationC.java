package chap8;
//378p ���� : �������̽� ���

public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImplemenationA-methodA() ����");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationB-methodB() ����");
	}

	@Override
	public void methodC() {	
		System.out.println("ImplementationC-methodA() ����");
	}

}
