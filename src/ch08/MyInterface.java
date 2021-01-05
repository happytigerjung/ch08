package ch08;

public interface MyInterface {
//	기존 인터페이스의 기능1
	public void method1();
	
	
//	기존의 인터페이스에 기능이 추가로 필요할때는
//	1.기존 인터페이스에 추상 메서드를 추가
//	public void method2();
//	2.새로운 인터페이스 파일을 생성하여 다중 상속 받음
//	문제 : 인터페이스를 사용한 다형성 부분에서 오류가 발생할 가능성이 존재, 여러개의 인터페이스를 생성하야 하는 경우가 발생
//	3.기본 인터페이스 파일에 디폴트 메서드를 추가하여 사용
	public default void method2() {
		System.out.println("MyInterface 의 method2");
	}

}
