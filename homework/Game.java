package homework;

public class Game {
	public Game() {
		System.out.println("Oyun Maðazasý programý açýldý");
		
		
		
	}
	public Game(String id,Double price, int rate, String gameType) {
	this();
	this.id=id;
	this.price=price;
	this.rate=rate;
	this.gameType=gameType;
	
	}
	
	String id;
	double price;
	int rate;
	String gameType;

}
