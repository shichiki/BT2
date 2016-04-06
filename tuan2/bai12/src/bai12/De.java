package bai12;

import java.util.Random;

public class De extends dongvat{
	
	public De()
	{
		Random rand = new Random();
		socon = rand.nextInt(100);
		soluongsua =rand.nextInt(10);
		tiengkeu = "Deeeeeeeeeeeee";
	}
	public String  getde()
	{
		return  tiengkeu();
	}

}
