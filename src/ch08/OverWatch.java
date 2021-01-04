package ch08;

public class OverWatch {

	public static void main(String[] args) {
		
		Player player = new Player();
		Charactor ch;
		ch = new McCree();
		
		player.cMove(ch);
		player.cStop(ch);
		player.cAttack(ch);
		player.cSkill(ch);
		
		ch = new Genzi();
		
		player.cMove(ch);
		player.cStop(ch);
		player.cAttack(ch);
		player.cSkill(ch);

	}

}
