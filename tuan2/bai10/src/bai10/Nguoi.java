package bai10;

public class Nguoi {
	protected String Hoten;
	protected int Tuoi;
	public Nguoi()
	{
		Hoten="";
		Tuoi=0;
	}
	public String get_ten()
	{
		return Hoten ; 
	}
	public int  get_tuoi()
	{
		return Tuoi;
	}
	public void set_ten(String hoten)
	{
		Hoten=hoten;
	}
	public  void set_tuoi( int _tuoi)
	{
		Tuoi=_tuoi;
	}
	
	
	
	

}
