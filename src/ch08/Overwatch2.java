package ch08;

public class Overwatch2 {

	public static void main(String[] args) {
		Zarya z = new Zarya();
		Winston w = new Winston();
		Diva d = new Diva();
		
		z.forward();
		z.attack();
		z.skill();
		z.spskill();
		
		w.left();
		w.forward();
		w.attack();
		w.skill();
		w.backward();
		
		d.attack();
		d.backward();
		d.skill();
		d.spskill();
		
		
		System.out.println("\n======추상 클래스로 구현======\n");
		DivaClass dc = new DivaClass();
		dc.attack();
		dc.spskill();
		
		
		System.out.println("\n====== 인터페이스의 다중 상속 시 다향성 ======\n");
		Movement vm = null;
		Attack va = null;
		
//		부모 인터페이스 타입의 변수에 구현 클래스 타입의 객체를 대입하였기 때문에 부모 인터페이스의 맴버만 사용이 가능
		vm = z;
		vm.left();
		vm.right();
		
	    va = z;
	    va.attack();
	    va.skill();
		
		
	    Character2 ch2;
	    ch2 = new Sombra();
	    ch2.attack();
	    ch2.skill();
	    ch2.spskill();

	}

}

















