package models;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		FootClan hank = new FootClan();
		hank.robBank();
		NinjaTurtle donny = new NinjaTurtle();
		donny.fight();
		Civilians bob = new Civilians();
		bob.robBank();
		bob.fight();
		donny.readBook();
		bob.readBook();
		
		SideKick casey = new SideKick();
		
		casey.eatPizza();
		
		donny.eatPizza();
		bob.eatPizza();
		GoodGuys.goodGreet();
		
	}
	
	

}
