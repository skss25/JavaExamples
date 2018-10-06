package chap8;

//372p 예제 : 매개 변수의 다형성

public class Driver {
	public void drive(Vehicle vehicle) {
		//376p 예제 : 객체 타입 확인
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
	
	
}
