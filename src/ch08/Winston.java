package ch08;

public class Winston implements Attack, Movement {

	@Override
	public void left() {
		System.out.println("윈스턴이 왼쪽으로 이동합니다.");

	}

	@Override
	public void right() {
		System.out.println("윈스턴이 오른쪽으로 이동합니다.");

	}

	@Override
	public void forward() {
		System.out.println("윈스턴이 앞으로 이동합니다.");

	}

	@Override
	public void backward() {
		System.out.println("윈스턴이 뒤쪽으로 이동합니다.");

	}

	@Override
	public void attack() {
		System.out.println("윈스턴이 테슬라 캐논 으로 공격합니다.");

	}

	@Override
	public void skill() {
		System.out.println("윈스턴이 점프팩을 사용 합니다.");

	}

	@Override
	public void spskill() {
		System.out.println("윈스턴이 초필살기를 사용 합니다.");

	}

}
