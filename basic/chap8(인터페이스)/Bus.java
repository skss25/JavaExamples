package chap8;
//372p 예제 : 매개 변수의 다형성
//374p 예제 : 강제 타입 변환
public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
