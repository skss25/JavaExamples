package chap8;
//372p 예제 : 매개 변수의 다형성

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}
