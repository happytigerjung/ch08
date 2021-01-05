package ch08;

public class RemoteControlMain {

	public static void main(String[] args) {
		Television tv = new Television();
		Audio audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(15);
		tv.setMute(true);
		tv.turnOff();
		
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(-10);
		audio.turnOff();
		
		
//		인터페이스도 다형성 구현이 가능함
//		인터페이스 타입의 변수는 생성이 가능함(객체화는 불가)
		System.out.println("====================");
		RemoteControl rc;
		rc = tv;
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(8);
		rc.turnOff();
		
		System.out.println("====================");
		rc = audio;
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(8);
		rc.turnOff();
		
		System.out.println("\n==========익명 구현 객체 사용==========\n");
		
		RemoteControl rc1 = new RemoteControl() {
			private int volume; //클래스 멤버 변수
			
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
				
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
				}
			
		};
		
		rc1.turnOn();
		rc1.setVolume(10);
		rc1.setMute(true);
		rc1.turnOff();

	}

}


























