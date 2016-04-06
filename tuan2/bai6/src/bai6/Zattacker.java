package bai6;
import java.util.Random;

public class Zattacker {
	private int M;
	private int P;
	public Zattacker()
	{
		M=50;
		int min =20;
		int max=30;
		Random rn = new Random();
        int range = max - min + 1;
        P = min + rn.nextInt(range);
	}
	
	    
	public Zattacker(int p)
	{
		P=p;
	}
	public void setP(int p)
	{
		P=p;
	}
	public int getP()
	{
		return P;
	}
	public int getM()
	{
		return M;
	}
	public double nangluong(int s)
	{
		return M*s + P*P*s;
	}
}
