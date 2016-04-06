package bai2;

public class hinhvuong extends hinh{
	private int a;
	public hinhvuong()
	{
		this.a=0;
	}
	public hinhvuong(int a)
	{
		this.a=a;
	}
	public void seta(int a)
	{
		this.a=a;
		
	}
	public int geta()
	{
		return this.a;
	}
	

	@Override
	public double Dientich() {
		// TODO Auto-generated method stub
		double ketqua = this.a*this.a;
		return ketqua;
	}

	@Override
	public double ChuVi() {
		// TODO Auto-generated method stub
		double chuvi= this.a*4;
		return chuvi;
	}

	
	

}
