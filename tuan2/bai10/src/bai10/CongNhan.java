package bai10;

public class CongNhan extends Nguoi {
	private String Nganh;
	private int MaCN;
	public CongNhan()
	{
		Nganh="May";
		MaCN=1352056;
	}
	public String get_Nganh()
	{
		return Nganh;
	}
	public int get_MACN()
	{
		return MaCN;
	}
	public void set_Nganh(String nganh)
	{
		Nganh=nganh;
	}
	public void set_MaCN(int macn)
	{
		MaCN=macn;
	}

}
