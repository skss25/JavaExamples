package chap9;

//402P. ���� : ��ø �������̽�
public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
}
