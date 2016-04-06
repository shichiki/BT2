package bai5;

import java.util.Scanner;

public class TamGiac extends Hinh2D {

	private Point d1;
    private Point d2;
    private Point d3;
    

    TamGiac() { }
    
    TamGiac(Point d1, Point d2, Point d3) {
        
        this.d1 = d1; this.d2 = d2; this.d3 = d3;
    }
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Tam Giac";
	}

	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int x, y;

	        System.out.println("Nhap hoanh do, tung do cua dinh thu nhat:");
	        x = sc.nextInt();
	        y = sc.nextInt();
	        this.d1 = new Point(x, y);

	        System.out.println("Nhap hoanh do, tung do cua dinh thu hai:");
	        x = sc.nextInt();
	        y = sc.nextInt();
	        this.d2 = new Point(x, y);

	        System.out.println("Nhap hoanh do, tung do cua dinh thu ba:");
	        x = sc.nextInt();
	        y = sc.nextInt();
	        this.d3 = new Point(x, y);
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		 return (d1.Khoangcach(d2) + d2.Khoangcach(d3) + d3.Khoangcach(d1));
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		// Su dung cong thuc Heron:
        // S = sqrt[ p(p-a)(p-b)(p-c) ]
        double a, b, c, p;
        a = d1.Khoangcach(d2);
        b = d2.Khoangcach(d3);
        c = d3.Khoangcach(d1);
        p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public boolean laDiemBenTrong(Point d) {
		// TODO Auto-generated method stub
		 boolean duong1 = (d.layPhia(this.d1, this.d2) * this.d3.layPhia(this.d1, this.d2)) >= 0;
	        boolean duong2 = (d.layPhia(this.d2, this.d3) * this.d1.layPhia(this.d2, this.d3)) >= 0;
	        boolean duong3 = (d.layPhia(this.d3, this.d1) * this.d2.layPhia(this.d3, this.d1)) >= 0;
	        
	       if(duong1&& duong2 && duong3)
	    	   return true;
	       else
	    	   return false;
	}

}
