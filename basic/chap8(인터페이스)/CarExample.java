package chap8;
//368p ���� : �ʵ��� ������

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire=new KumhoTire();
		myCar.frontRightTire=new KumhoTire();
		
		myCar.run();
		System.out.println();
		//369p ���� : �������̽� �迭�� ���� ��ü ����
		Car1 myCar1 = new Car1();
		
		myCar1.run();
		
		myCar1.tires[0] = new KumhoTire();
		myCar1.tires[1] = new KumhoTire();
		
		myCar1.run();
	}

}
