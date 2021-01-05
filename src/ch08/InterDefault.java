package ch08;

public interface InterDefault {
	
	public void method1();
	public void method2();
	
	public default void defaultMethod() {
		System.out.println("InterDeault 인테페이스의 디폴트 메소드");
	}

}
