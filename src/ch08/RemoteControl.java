package ch08;

//인터페이스가 가질 수 있는 멤버는 정적멤머(상수,정적메서드),추상메서드,디폴트메서드
public interface RemoteControl {
//	static 키워드가 빠져도 상관없음
//	인터페이스가 가질 수 있는 멤버 벼수는 상수 밖에 없어서 final static 키워드가 빠져도 상관없음
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
//	abstract 키워드를 빼도 상관없음
//	인터페이스가 가질 수 있는 메서드는 추상 메서드 밖에 없기 때문에 없어도 상관없음
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
//	default 메서드는 일반 메서드와 동일함
//	default 키워드를 반드시 사용, public 접근제한자가 기본
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}
		else {
			System.out.println("무음 해체 합니다.");
		}
	}
	
//	정적 메서드도 인터페이스의 맴버
//	public 접근 제한자가 기본
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}





