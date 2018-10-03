package chap8;
//368p 예제 : 필드의 다형성

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire=new KumhoTire();
		myCar.frontRightTire=new KumhoTire();
		
		myCar.run();
	}

}
