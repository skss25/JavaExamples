package chap9;
//419P. 문제 6번
public class Chatting {
	void startChat(String chatId) {
		final String nickName = chatId;
		
		//메소드 내에서 익명 객체 생성
		//익명 객체는 startChat 메소드가 종료가 되더라도 힙 메모리 영역에 남게된다. 하지만 메소드의 변수(로컬 변수, 매개변수)는 스택 메모리 영역에서 사라짐
		//따라서 익명 객체 내부의 메소드가 바깥 메소드(startChat)의 로컬 변수나 매개변수를 사용할 경우 문제가 되는데..
		//로컬 변수와 매개 변수가 final 특성을 갖게되면 익명 객체 내부로 변수들이 복사가 된다.
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
	
	class Chat {
		void start() {};
		void sendMessage(String message) {}
	}
}
