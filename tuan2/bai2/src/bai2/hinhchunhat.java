package bai2;

public class hinhchunhat extends hinh {
	private int a;
	private int b;
	public hinhchunhat()
	{
		this.a=0;
		this.b=0;
	}
	public hinhchunhat(int a,int b)
	{
		
		this.a =a;
		this.b=b;
	}
	public void seta(int a)
	{
		this.a=a;
		
	}
	public void setb(int b)
	{
		this.b=b;
	}
	public int geta()
	{
		return this.a;
	}
	public int getb()
	{
		return this.b;
	}
	@Override
	public double Dientich() {
		// TODO Auto-generated method stub
		double kq=this.a*this.b;
		return kq;
	}
	@Override
	public double ChuVi() {
		// TODO Auto-generated method stub
		double kq=(this.a+this.b)*2;
		return kq;
	}
	
	

}
