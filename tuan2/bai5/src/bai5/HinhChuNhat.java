package bai5;
import java.util.Scanner;

public class HinhChuNhat extends Hinh2D{
	
	protected Point traiTren;
    private Point phaiDuoi;
    private int cao;
    private int rong;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Hinh Chu Nhat";
	}
	 	HinhChuNhat() { }
	    HinhChuNhat(Point traiTren, Point phaiDuoi) {
	        
	        this.traiTren = traiTren;
	        this.phaiDuoi = phaiDuoi;
	        
	        this.cao = Math.abs(this.traiTren.getY() - this.phaiDuoi.getY());
	        this.rong = Math.abs(this.traiTren.getX() - this.phaiDuoi.getX());
	    }
	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Nhap hoanh do, tung do diem goc trai, tren hcn:");
        x = sc.nextInt();
        y = sc.nextInt();
        this.traiTren = new Point(x, y);

        System.out.println("Nhap hoanh do, tung do diem goc phai, duoi hcn:");
        x = sc.nextInt();
        y = sc.nextInt();
        this.phaiDuoi = new Point(x, y);

        this.cao = Math.abs(this.traiTren.getY() - this.phaiDuoi.getY());
        this.rong = Math.abs(this.traiTren.getX() - this.phaiDuoi.getX());
		
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		
		  return 2 * (this.cao + this.rong);
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		 return this.cao * this.rong;
	}

	@Override
	public boolean laDiemBenTrong(Point d) {
		// TODO Auto-generated method stub
		  int x = d.getX();
	        int y = d.getY();
	        if (this.traiTren.getX()>=x && x>=this.phaiDuoi.getX() && this.phaiDuoi.getY()<=y && y <= this.traiTren.getY())
	        {
	        	return true;
	        }
	        else
	        	return false;
	
	}
	

}
