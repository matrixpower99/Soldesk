// OOD(OODesign)
public class BMICheckMain {

	public static void main(String[] args) {
		// 실제로 병원가서 BMI 검사하는 상황을 그려 
		// -> 필요 없는 것들 제외(대기중인 손님, 의사 컴퓨터 사양 등...)
		// -> 손님, 의사가 필요한 것 같음.
		
		// 각 등장인물들의 속성 체크
		// 상황을 진행(각 등장인물들의 액션 체크)
		// 의사가 출근해 있다가, 손님 불러서 입장시켜서 시작
		
		Doctor d = new Doctor();
		d.start();
	}
}
