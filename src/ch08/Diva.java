package ch08;

public class Diva implements Attack, Movement {

	@Override
	public void left() {
		System.out.println("디바가 왼쪽으로 움직입니다.");

	}

	@Override
	public void right() {
		System.out.println("디바가 오른쪽으로 움직입니다.");

	}

	@Override
	public void forward() {
		System.out.println("디바가 앞쪽으로 움직입니다.");

	}

	@Override
	public void backward() {
		System.out.println("디바가 뒤쪽으로 움직입니다.");

	}

	@Override
	public void attack() {
		System.out.println("디바가 용학포로 공격합니다.");

	}

	@Override
	public void skill() {
		System.out.println("디바가 방어 메트릭스를 사용합니다.");

	}

	@Override
	public void spskill() {
		System.out.println("디바가 초필살기를 사용 가즈아아 합니다.");

	}

}
