package bai6;

import java.util.Random;

public class Carrier {

	private int M;
	private int E;
	public Carrier()
	{
		M=30;
		int min =50;
		int max=100;
		Random rn = new Random();
        int range = max - min + 1;
        E = min + rn.nextInt(range);
	}
	public  void setE(int e)
	{
		E=e;
	}
	public int getE()
	{
		return E;
	}
	public int getM()
	{
		return M;
	}
	public double nangluong(int s)
	{
		return M*s + 4*E*s;
	}
}
