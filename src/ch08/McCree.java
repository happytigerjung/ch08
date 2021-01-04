package ch08;

public class McCree implements Charactor {

	@Override
	public void move() {
		System.out.println("맥크리가 이동합니다");

	}

	@Override
	public void stop() {
		System.out.println("맥크리가 멈춥니다.");

	}

	@Override
	public void attack() {
		System.out.println("맥크리가 권총으로 공격합니다.");

	}

	@Override
	public void skill() {
		System.out.println("맥크리가 석양이 집니다.");

	}

}
