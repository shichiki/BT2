package bai9;

public class nhanvien {
	private String hoten;
	private String ngaysinh;
	
	public nhanvien()
	{
		hoten="le thi tuyet mai";
		ngaysinh="26/10/1995";

	}
	public nhanvien(String hoten, String ngaysinh, double luong )
	{
		hoten=hoten;
		ngaysinh=ngaysinh;
		luong=luong;
	}
	public String get_ten()
	{
		return hoten;
	}
	public String get_ngaysinh()
	{
		return ngaysinh;
	}
	public void set_ten( String hoten)
	{
		hoten=hoten;
	}
	public void set_ngaysinh(String ngaysinh)
	{
		ngaysinh=ngaysinh;
	}
	
	
}
