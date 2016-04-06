package bai4;

public class PhanSo {
	private int Tu_so;
	private int Mau_So;
	public PhanSo(int tu, int mau) 
	 {//khoi tao Point co toa do xy
	        this.Tu_so = tu;
	        this.Mau_So= mau;
	    }

	    public PhanSo()
	    {//khoi tao voi toa so 0;0
	        this.Tu_so = 0;
	        this.Mau_So= 1;
	    }
	    public PhanSo(PhanSo p)
	    {//viet ra thui hem hieu co giong y cua de bai khong
	        this.Tu_so = p.Mau_So;
	        this.Tu_so = p.Mau_So;
	    }
	//tao Set va get cho x va y
	    
	    public int getX()
	    {
	        return Tu_so;
	    }

	    public int getY()
	    {
	        return Mau_So;
	    }

	    public void setX(int Tu_so) {
	        this.Tu_so = Tu_so;
	    }

	    public void setY(int Mau_So) {
	        this.Mau_So = Mau_So;
	    }
	    public PhanSo Tong(PhanSo b)
	    {
	    	PhanSo kq = new PhanSo();
	    	kq.Tu_so=this.Tu_so*b.Mau_So + b.Tu_so*this.Mau_So;
	    	kq.Mau_So=this.Mau_So*b.Mau_So;
	    	return kq;
	    	
	    }
	    public PhanSo Hieu(PhanSo b)
	    {
	    	PhanSo kq = new PhanSo();
	    	kq.Tu_so=this.Tu_so*b.Mau_So - b.Tu_so*this.Mau_So;
	    	kq.Mau_So=this.Mau_So*b.Mau_So;
	    	return kq;
	    	
	    }
	    public PhanSo Tich(PhanSo b)
	    {
	    	PhanSo kq = new PhanSo();
	    	kq.Tu_so = this.Tu_so*b.Tu_so;
	    	kq.Mau_So=this.Mau_So*b.Mau_So;
	    	return kq;
	    	
	    }
	    public PhanSo Thuong(PhanSo b)
	    {
	    	PhanSo kq =new PhanSo();
	    	kq.Tu_so =this.Tu_so*b.Mau_So;
	    	kq.Mau_So=this.Mau_So*b.Tu_so;
	    	
	    	return kq;
	    	
	    }

}
