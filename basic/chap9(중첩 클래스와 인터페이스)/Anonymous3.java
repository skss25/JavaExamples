package chap9;
//418P. ���� 5��
public class Anonymous3 {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("field�� �޸��ϴ�!");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("localVar�� �޸��ϴ�!");
			}
		};
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
