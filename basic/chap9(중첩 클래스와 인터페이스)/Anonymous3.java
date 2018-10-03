package chap9;
//418P. 문제 5번
public class Anonymous3 {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("field가 달립니다!");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("localVar가 달립니다!");
			}
		};
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
