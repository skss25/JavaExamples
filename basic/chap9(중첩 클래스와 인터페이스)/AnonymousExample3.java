package chap9;
//418P. ���� 5��
public class AnonymousExample3 {

	public static void main(String[] args) {
		Anonymous3 anony = new Anonymous3();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�!");
			}
		});
	}

}
