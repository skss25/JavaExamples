package chap9;

//399P. ���� : ���� Ŭ�������� ��� ����
public class Outter {
	//�ڹ� 7 ����
	public void method1(final int arg) {
		//���� ������ �Ű� ����
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ� 8 ����
	public void method2(int arg) {
		//final Ű���� ���� ���� ������ �Ű� ������ final Ư���� ���� �ȴ�.
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
