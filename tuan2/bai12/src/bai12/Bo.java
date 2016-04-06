package bai12;
import java.util.Random;

public class Bo extends dongvat {
	public Bo()
	{
		Random rand = new Random();
		socon = rand.nextInt(100);
		soluongsua =rand.nextInt(20);
		tiengkeu = "booooooooooooo";
	}
	public String  getbo()
	{
		return  tiengkeu();
	}
	
	


}
