package chap9;
//419P. ���� 6��
public class Chatting {
	void startChat(String chatId) {
		final String nickName = chatId;
		
		//�޼ҵ� ������ �͸� ��ü ����
		//�͸� ��ü�� startChat �޼ҵ尡 ���ᰡ �Ǵ��� �� �޸� ������ ���Եȴ�. ������ �޼ҵ��� ����(���� ����, �Ű�����)�� ���� �޸� �������� �����
		//���� �͸� ��ü ������ �޼ҵ尡 �ٱ� �޼ҵ�(startChat)�� ���� ������ �Ű������� ����� ��� ������ �Ǵµ�..
		//���� ������ �Ű� ������ final Ư���� ���ԵǸ� �͸� ��ü ���η� �������� ���簡 �ȴ�.
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���";
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
