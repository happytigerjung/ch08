package ch08;

public class InterDefaunltImpl implements InterDefault{

	@Override
	public void method1() {
		System.out.println("오버라이딩 된 method1");
		
	}

	@Override
	public void method2() {
		System.out.println("오버라이딩 된 method2");
		
	}
	
//	인터페이스의 디폴트 메서드는 일반적인 메서드이기 때문에 인터페이스를 상속받았을 경우 디폴트 메서드를 오버라이딩할 필요가 없다
//	@Override
//	public void defaultMethod() {
//		
//	}

}
