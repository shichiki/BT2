package bai12;

import java.util.Random;

public class Cuu  extends dongvat {
	public Cuu()
	{
		Random rand = new Random();
		socon = rand.nextInt(100);
		soluongsua =rand.nextInt(5);
		tiengkeu = "cuuuuuuuuuuuuu";
	}
	public String  getcuu()
	{
		return  tiengkeu();
	}

}
