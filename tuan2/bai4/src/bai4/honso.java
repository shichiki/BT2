package bai4;

public class honso {
	private int honso;
	private PhanSo a;
	public honso()
	{
		this.honso =0;
		this.a =new PhanSo();
	}
	public honso(int a, PhanSo k)
	{
		this.honso =a ;
		this.a =k;
	}
	  public int gethonso()
	    {
	        return honso;
	    }

	    public void sethonso(int honso) {
	        this.honso= honso;
	    }
	    public int getX()
	    {
	        return a.getX();
	    }

	    public int getY()
	    {
	        return a.getY();
	    }

	    public void setX(int Tu_so) {
	        a.setX(Tu_so);
	    }

	    public void setY(int Mau_So) {
	    	a.setY(Mau_So);
	    }
	public honso cong(honso b)
	{
		honso kq = new honso();
		PhanSo ka= new PhanSo();
		PhanSo kb = new PhanSo();
		ka.setX(this.honso* this.a.getY() + this.a.getX());
		ka.setY(this.a.getY());
		kb.setX((b.honso* b.a.getY()) + b.a.getX());
		kb.setY(b.a.getY());
		PhanSo kt=ka.Tong(kb);
		kq.honso=kt.getX()/kt.getY();
		kq.a.setX(kt.getX() - (kq.honso * kt.getY()));
		kq.a.setY(kt.getY());
		
		
		return kq;
	}
	public honso Tru(honso b)
	{
		honso kq = new honso();
		PhanSo ka= new PhanSo();
		PhanSo kb = new PhanSo();
		ka.setX(this.honso* this.a.getY() + this.a.getX());
		ka.setY(this.a.getY());
		kb.setX((b.honso* b.a.getY()) + b.a.getX());
		kb.setY(b.a.getY());
		PhanSo kt=ka.Hieu(kb);
		kq.honso=kt.getX()/kt.getY();
		kq.a.setX(kt.getX() - (kq.honso * kt.getY()));
		kq.a.setY(kt.getY());
		
		return kq;
	}
	public honso Nhan(honso b)
	{
		honso kq = new honso();
		PhanSo ka= new PhanSo();
		PhanSo kb = new PhanSo();
		ka.setX(this.honso* this.a.getY() + this.a.getX());
		ka.setY(this.a.getY());
		kb.setX((b.honso* b.a.getY()) + b.a.getX());
		kb.setY(b.a.getY());
		PhanSo kt=ka.Tich(kb);
		kq.honso=kt.getX()/kt.getY();
		kq.a.setX(kt.getX() - (kq.honso * kt.getY()));
		kq.a.setY(kt.getY());
		
		return kq;
	}
	public honso Chia(honso b)
	{
		honso kq = new honso();
		PhanSo ka= new PhanSo();
		PhanSo kb = new PhanSo();
		ka.setX(this.honso* this.a.getY() + this.a.getX());
		ka.setY(this.a.getY());
		kb.setX((b.honso* b.a.getY()) + b.a.getX());
		kb.setY(b.a.getY());
		PhanSo kt=ka.Thuong(kb);
		kq.honso=kt.getX()/kt.getY();
		kq.a.setX(kt.getX() - (kq.honso * kt.getY()));
		kq.a.setY(kt.getY());
		
		return kq;
	}
	

}
