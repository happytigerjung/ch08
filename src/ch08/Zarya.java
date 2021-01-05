package ch08;

public class Zarya implements Movement, Attack {
	
	@Override
	public void attack() {
		System.out.println("자리야가 입자포로 공격합니다.");
		
	}

	@Override
	public void skill() {
		System.out.println("자리야가 입자 방벽을 사용합니다.");
		
	}
	
	@Override
	public void spskill() {
		System.out.println("자리야가 필살기를 사용합니다.");
		
	}


	@Override
	public void left() {
		System.out.println("자리야가 왼쪽으로 이동합니다.");

	}

	@Override
	public void right() {
		System.out.println("자리야가 오른쪽으로 이동합니다.");

	}

	@Override
	public void forward() {
		System.out.println("자리야가 앞으로 이동합니다.");

	}

	@Override
	public void backward() {
		System.out.println("자리야가 뒤쪽으로 이동합니다.");

	}

	

}
