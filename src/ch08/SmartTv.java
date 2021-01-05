package ch08;

public class SmartTv implements RemoteControl, Searchable {

private int volume;

	//	인터페이스 Searchable 로 부터 상속받은 추상 메소드
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");

	}

	//인터페이스 RemoteControl 로 부터 상속받은 추상 메소드
	@Override
	public void turnOn() {
		System.out.println(" 스마트 tv의 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println(" 스마트 tv의 전원을 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			   volume = RemoteControl.MAX_VOLUME;
				}
				else if(volume < RemoteControl.MIN_VOLUME) {
					    volume = RemoteControl.MIN_VOLUME;
				}
				else {
					this.volume = volume;
				}
				System.out.println("현재 볼륩은 :"+this.volume);
	
	};

}
