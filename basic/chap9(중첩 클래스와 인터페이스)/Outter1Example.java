package chap9;

//401P. ���� : ��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
public class Outter1Example {

	public static void main(String[] args) {
		//�ν��Ͻ� ��� Ŭ������ ��ü�� ����
		Outter1 outter1 = new Outter1();
		Outter1.Nested nested = outter1.new Nested();
		
		nested.print();
	}

}
