package bai10;

public class HocSinh  extends Nguoi{
	private int MSHS;
	private String Truong;
	public HocSinh()
	{
		MSHS=123;
		Truong="THPT Hoa Binh";
	}
	public void set_MSSV(int mssv)
	{
		MSHS=mssv;
	}
	public int get_MSSV()
	{
		return MSHS;
	}
	public String get_truong()
	{
		return Truong;
	}
	public void  set_Truong(String truong)
	{
		Truong=truong;
	}

}
