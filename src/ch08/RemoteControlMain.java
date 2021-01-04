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

	}

}
