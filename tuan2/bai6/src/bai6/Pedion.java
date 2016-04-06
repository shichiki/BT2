package bai6;

import java.util.Random;

public class Pedion {
	private int M;
	private int F;
	public Pedion()
	{
		M=20;
		int min =1;
		int max=5;
		Random rn = new Random();
        int range = max - min + 1;
        F = min + rn.nextInt(range);
	}
	public int getF()
	{
		return F;
	}
	public int getM()
	{
		return M;
	}
	public void setF(int f)
	{
		F=f;
	}
	public double nangluong(int s)
	{
		return M*s +((F+1)*s/2);
	}
}
