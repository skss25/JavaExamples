package chap8;

//372p ���� : �Ű� ������ ������

public class Driver {
	public void drive(Vehicle vehicle) {
		//376p ���� : ��ü Ÿ�� Ȯ��
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
	
	
}
