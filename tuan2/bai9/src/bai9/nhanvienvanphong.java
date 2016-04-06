package bai9;

public class nhanvienvanphong extends nhanvien{
		private int songaylamviec;
		private double luong;
		public void set(int songay)
		{
			songaylamviec=songay;
		}
	public nhanvienvanphong()
	{
		songaylamviec=0;
		luong=0;
	}
	
	public double tinhluong()
	{
		luong= songaylamviec*100000;
		return luong;
	}
}
