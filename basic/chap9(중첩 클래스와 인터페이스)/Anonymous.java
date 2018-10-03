package chap9;
//407P. ���� : �͸� ��ü

public class Anonymous {
	//Person Ŭ������ ����, new Ű����� �ش� Ŭ���� ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	
	void method1() {
		//�͸� ��ü ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		
		//���� ���� ���
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
