package chap8;
//368p 예제 : 필드의 다형성
public class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}
