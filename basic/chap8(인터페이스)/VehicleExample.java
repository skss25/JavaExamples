package chap8;
//374p ���� : ���� Ÿ�� ��ȯ

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
