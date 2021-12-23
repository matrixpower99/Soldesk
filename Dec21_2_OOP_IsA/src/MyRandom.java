import java.util.Random;

// 상속(extends) : 기존에 있던 기능 물려받고 + 기능 추가
public class MyRandom extends Random {
	// overridng - 물려받아온 메소드 기능 바꾸기(보통은 추가를...)
	@Override
	public int nextInt(int bound) {
		int n = super.nextInt(bound); // 기존 Random에 있던 그 nextInt(랜덤뽑기)
		return (n %2 == 1) ? n : nextInt(bound);
	}

}
