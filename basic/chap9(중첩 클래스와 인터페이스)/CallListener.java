package chap9;

//403P. 예제 : 중첩 인터페이스
public class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
