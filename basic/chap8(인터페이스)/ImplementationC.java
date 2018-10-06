package chap8;
//378p 예제 : 인터페이스 상속

public class ImplementationC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImplemenationA-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationB-methodB() 실행");
	}

	@Override
	public void methodC() {	
		System.out.println("ImplementationC-methodA() 실행");
	}

}
