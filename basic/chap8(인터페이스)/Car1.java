package chap8;
//369p 예제 : 인터페이스 배열로 구현 객체 관리

public class Car1 {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
