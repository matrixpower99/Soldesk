import java.util.Random;

// ���(extends) : ������ �ִ� ��� �����ް� + ��� �߰�
public class MyRandom extends Random {
	// overridng - �����޾ƿ� �޼ҵ� ��� �ٲٱ�(������ �߰���...)
	@Override
	public int nextInt(int bound) {
		int n = super.nextInt(bound); // ���� Random�� �ִ� �� nextInt(�����̱�)
		return (n %2 == 1) ? n : nextInt(bound);
	}

}
