package bai7;

public class TangBong {
	private int dongia;
	private int soluong;
	public TangBong()
	{
		dongia=0;
		soluong=0;
	}
	public TangBong(int dongia,int soluong)
	{
		dongia=dongia;
		soluong=soluong;
	}
	public int  getdongia()
	{
		return dongia;
	}
	public int get_soluong()
	{
		return soluong;
	}
	public void setdongia(int dongia)
	{
		this.dongia=dongia;
	}
	public void set_sogiothue(int sogiothue)
	{
		this.soluong=soluong;
	}
	public double tinhtien()
	{
		double tien;
		tien=soluong*dongia;
		
		return tien;
	}

}
