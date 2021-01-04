package ch08;

public abstract class RemoteControlClass {
	public final static int MAX_VOlUME = 10;
	public final static int MAX_VOLUME = 0;
	
	public abstract void turnON();
	public abstract void turnOff();
	public abstract void setVolume(int Volume);
	
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음을 취소합니다.");
		}
	}

}
