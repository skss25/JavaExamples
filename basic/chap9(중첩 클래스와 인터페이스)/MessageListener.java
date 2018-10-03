package chap9;

//403P. 예제 : 중첩 인터페이스
public class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
