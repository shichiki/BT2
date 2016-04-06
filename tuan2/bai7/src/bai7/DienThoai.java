package bai7;

public class DienThoai {
	private int dongia;
	private int sophut;
	public DienThoai()
	{
		dongia=0;
		sophut=0;
	}
	public DienThoai(int dongia,int sophut)
	{
		dongia=dongia;
		this.sophut=sophut;
	}
	public int  getdongia()
	{
		return dongia;
	}
	public int get_sophut()
	{
		return sophut;
	}
	public void setdongia(int dongia)
	{
		this.dongia=dongia;
	}
	public void set_sogiothue(int sophut)
	{
		this.sophut=sophut;
	}
	public double tinhtien()
	{
		double tien=sophut*dongia;
		if(tien >300000)
		{
			double tien1 = tien -300000;
			tien1 =tien1*0.2;
			tien =300000+tien1;
		}
		return tien;
	}

}
