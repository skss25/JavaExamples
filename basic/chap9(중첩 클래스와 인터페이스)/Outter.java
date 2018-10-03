package chap9;

//399P. 예제 : 로컬 클래스에서 사용 제한
public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		//로컬 변수와 매개 변수
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		//final 키워드 없이 로컬 변수와 매개 변수는 final 특성을 갖게 된다.
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
