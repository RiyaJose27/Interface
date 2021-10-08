package models;

public interface GoodGuys {
	
	void readBook();
	
	void fight();
	default void eatPizza() {
		System.out.println("nOm nom ,e atingpizza");
		
	}

	
	public static void goodGreet() {
		System.out.println("Hello from the good guy");
	}
	
	
}
