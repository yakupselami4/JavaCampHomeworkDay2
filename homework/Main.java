package homework;

public class Main {
	public static void main(String[] args) {
		
		Game game1= new Game();
		game1.id="Rainbow six siege";
		game1.gameType="FPS,PVP";
		game1.price=85;
		game1.rate=7;
		
		Game game2= new Game();
		game2.id="Dead Cells";
		game2.gameType="Roguelike,Tek Oyunculu";
		game2.price=35;
		game2.rate=10;
		
		Game game3= new Game();
		game3.id="Deus Ex:Mankind Divided";
		game3.gameType="Cyberpubk";
		game3.price=55;
		game3.rate=9;
		
		Game[] games= {game1,game2,game3};
		
		
		for(Game game:games) {
			System.out.println("----------");			
			System.out.println("Oyunun ismi: "+game.id);
			System.out.println("Oyunun t�r�: "+game.gameType);
			System.out.println("Oyunun Fiyat�: "+game.price);
			System.out.println("Oyunun IGN Puan�: "+game.rate);		
			
		}
		System.out.println(games.length);
		
		Award award1= new Award();
		award1.id="Y�l�n Oyunu";
		award1.name="Hades";
		award1.year=2020;
		
		Award award2= new Award();
		award2.id="Y�l�n Ba��ms�z Oyunu";
		award2.name="Hades";
		award2.year=2020;
		
		Award[] awards= {award1,award2};
		for (Award award: awards) {
			System.out.println("----------");
			System.out.println("�d�l�n �smi: "+award.id);
			System.out.println("�d�l�n Y�l�: "+award.year);
			System.out.println("�d�l�n Kazanan�: "+award.name);
		}
		
		GameManager gamemanager=new GameManager();
		gamemanager.PlayedGames(game1);
		gamemanager.PlayedGames(game2);
		gamemanager.PlayedGames(game3);
		


		

	}

}
