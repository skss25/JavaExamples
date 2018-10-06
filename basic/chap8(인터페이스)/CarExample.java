package chap8;
//368p 예제 : 필드의 다형성

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire=new KumhoTire();
		myCar.frontRightTire=new KumhoTire();
		
		myCar.run();
		System.out.println();
		//369p 예제 : 인터페이스 배열로 구현 객체 관리
		Car1 myCar1 = new Car1();
		
		myCar1.run();
		
		myCar1.tires[0] = new KumhoTire();
		myCar1.tires[1] = new KumhoTire();
		
		myCar1.run();
	}

}
