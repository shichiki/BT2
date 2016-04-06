package bai9;

public class nhanviensanxuat extends nhanvien {
	private double tienluong;
	private int sosanpham;
	private double luongcoban;
	public void set_luong(int luong)
	{
		luongcoban=luong;
	}
	public void set_sosanpham(int sanpham)
	{
		sosanpham=sanpham;
	}
	
	public nhanviensanxuat()
	{
		tienluong=0;
		sosanpham=0;
		luongcoban=0;
	}
	public double tinhtien()
	{
		tienluong=luongcoban+ sosanpham*5000;
		return tienluong;
	}

}
