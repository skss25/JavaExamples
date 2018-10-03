package chap8;

public interface RemoteControl {
	//��� �ʵ�
	public int MAX_VOLUME = 10; //public static final int  MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; //public static final int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	public void turnOn(); //public abstract void turnOn();
	public void turnOff();  //public abstract void turnOff();
	public void setVolume(int volume); //public abstract void setVolume(int volume);
	
	//����Ʈ �޼ҵ�(Java 8)
	default void setMute(boolean mute) { //public default void setMute(boolean mute)
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ�(Java 8)
	static void changeBattery() { //public static void changeBattery()
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
