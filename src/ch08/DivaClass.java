package ch08;

public class DivaClass extends AttackClass {

	@Override
	public void attack() {
		System.out.println("디바가 공격합니다.");
		
	}

	@Override
	public void skill() {
		System.out.println("디바가 필살기를 씁니다.");
		
	}

	@Override
	public void spskill() {
		System.out.println("디바가 앙 기모띠 입니다.");
		
	}

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

	
	

}
