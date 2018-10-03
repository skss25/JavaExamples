package chap9;
//407P. 예제 : 익명 객체

public class Anonymous {
	//Person 클래스를 선언, new 키워드로 해당 클래스 생성
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	
	void method1() {
		//익명 객체 생성
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		//로컬 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
