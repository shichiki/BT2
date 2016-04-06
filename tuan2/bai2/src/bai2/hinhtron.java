package bai2;

public class hinhtron extends hinh {
	private int r;
	public hinhtron()
	{
		r=0;
	}
	public hinhtron(int r)
	{
		this.r=r;
	}
	public void setb(int r)
	{
		this.r=r;
	}
	public int geta()
	{
		return this.r;
	}

	@Override
	public double Dientich() {
		// TODO Auto-generated method stub
		double kq = r*r *Math.PI;
		return kq;
	}

	@Override
	public double ChuVi() {
		// TODO Auto-generated method stub
		double kq = 2*r *Math.PI;
		return kq;
	}


	
	

}
