package bai5;

import java.util.Scanner;

public class HinhTron  extends Hinh2D{
	private Point tam;
    private int banKinh;
    
    HinhTron() {}

    HinhTron(Point tam, int banKinh) {
        
        this.tam = tam;
        this.banKinh = banKinh;
    }
    
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Hinh Tron";
	}

	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int x, y;

	        System.out.println("Nhap hoanh do, tung do cua tam hinh tron:");
	        x = sc.nextInt();
	        y = sc.nextInt();
	        this.tam = new Point(x, y);

	        System.out.println("Nhap ban kinh hinh tron:");
	        this.banKinh = sc.nextInt();
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		 return (Math.PI * 2 * this.banKinh);
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		 return (Math.PI * this.banKinh * this.banKinh);
	}

	@Override
	public boolean laDiemBenTrong(Point d) {
		// TODO Auto-generated method stub
		double khoangCach = this.tam.Khoangcach(d);
        if (khoangCach <= this.banKinh)
        	return true;
        else return false;
	}

}
