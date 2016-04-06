package bai2;

public class tamgiac extends hinh{
	private int a;
	private int b;
	private int c;
	public tamgiac()
	{
		this.a=0;
		this.b=0;
		this.c=0;
	}
	public tamgiac (int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void seta(int a)
	{
		this.a=a;
		
	}
	public void setb(int b)
	{
		this.b=b;
	}
	public void setc(int c)
	{
		this.c=c;
	}
	public int geta()
	{
		return this.a;
	}
	public int getb()
	{
		return this.b;
	}
	public int getc()
	{
		return this.c;
	}

	@Override
	public double Dientich() {
		// TODO Auto-generated method stub
		double p=(a+b+c)/2;
		double kq  =Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return kq;
		
	}

	@Override
	public double ChuVi() {
		// TODO Auto-generated method stub
		double kq=a+b+c;
		return kq;
	}

	
	
	

}
