package bai5;
import java.util.Scanner;

public class hinhvuong extends Hinh2D {
	Point traiTren;
	 private int doDai;
	    hinhvuong() 
	    { 
	    	
	    }
	    public hinhvuong(Point traiTren, int doDai) {
	        this.traiTren = traiTren;
	        this.doDai = doDai;
	    }
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return "Hinh Vuong";
		}
		@Override
		public void nhapThongTin() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        int x, y;

	        System.out.println("Nhap hoanh do, tung do diem goc trai, tren hinh vuong:");
	        x = sc.nextInt();
	        y = sc.nextInt();
	        this.traiTren = new Point(x, y);

	        System.out.println("Nhap do dai hinh vuong:");
	        this.doDai = sc.nextInt();
		}
		@Override
		public double chuVi() {
			// TODO Auto-generated method stub
			return 4 * this.doDai;
		}
		@Override
		public double dienTich() {
			// TODO Auto-generated method stub
			 return (this.doDai * this.doDai);
			
		}
		@Override
		public boolean laDiemBenTrong(Point d) {
			// TODO Auto-generated method stub
		       int x = d.getX();
		        int y = d.getY();
		        if(this.traiTren.getX()<=x &&  x<= this.traiTren.getX()+this.doDai && this.traiTren.getY()<=y && y<= this.traiTren.getY()+this.doDai)
		        return true;
		        else
		        	return false;
		}
	    

}
