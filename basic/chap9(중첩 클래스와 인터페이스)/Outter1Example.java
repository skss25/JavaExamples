package chap9;

//401P. 예제 : 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter1Example {

	public static void main(String[] args) {
		//인스턴스 멤버 클래스를 객체로 생성
		Outter1 outter1 = new Outter1();
		Outter1.Nested nested = outter1.new Nested();
		
		nested.print();
	}

}
