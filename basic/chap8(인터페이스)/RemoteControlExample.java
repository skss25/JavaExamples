package chap8;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		RemoteControl rc1 = new RemoteControl() {
			public void turnOn() {/*실행문*/}
			public void turnOff() {/*실행문*/}
			public void setVolume(int volume) {/*실행문*/}
		};
		
		RemoteControl rc2 = null;
		
		rc2 = new Television();
		rc2.turnOn();
		rc2.turnOff();
		
		rc2 = new Audio();
		rc2.turnOn();
		rc2.turnOff();
		
		//362p
		RemoteControl rc3 = null;
		
		rc3 = new Television();
		rc3.turnOn();
		rc3.setMute(true);
		
		rc3 = new Audio();
		rc3.turnOn();
		rc3.setMute(true);
		
		//362p
		RemoteControl.changeBattery();
	}

}
