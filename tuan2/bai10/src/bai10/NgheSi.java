package bai10;

public class NgheSi extends Nguoi{
	private  String LinhVucNgheThuat;
	public NgheSi()
	{
		LinhVucNgheThuat="Ca Hat";
	}
	public void set_linhvuc(String linhvuc)
	{
		LinhVucNgheThuat=linhvuc;
	}
	public String get_linhvuc()
	{
		return LinhVucNgheThuat;
	}

}
