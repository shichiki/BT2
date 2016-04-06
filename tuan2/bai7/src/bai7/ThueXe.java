package bai7;

public class ThueXe {
	
	private int dongia;
	private int sogiothue;
	public ThueXe()
	{
		dongia=0;
		sogiothue=0;
	}
	public ThueXe(int dongia,int sogiothe)
	{
		dongia=dongia;
		sogiothue=sogiothe;
	}
	public int  getdongia()
	{
		return dongia;
	}
	public int get_sogiothe()
	{
		return sogiothue;
	}
	public void setdongia(int dongia)
	{
		this.dongia=dongia;
	}
	public void set_sogiothue(int sogiothue)
	{
		this.sogiothue=sogiothue;
	}
	public double tinhtien(int giothue)
	{
		double tien;
		if (this.sogiothue >6 )
		{
			tien = sogiothue*dongia*0.05;
		}
		tien=sogiothue*dongia;
	
		return tien;
		
		
	}
}

