package bai2;
import java.util.Scanner;

public class main {
	public static void main(String [] arg )
	{
		Scanner scan = new Scanner(System.in);
		hinhchunhat a= new hinhchunhat();
		System.out.println("nhap vao chieu dai hinh chu nhat");
		int a1= scan.nextInt();
		System.out.println("nhap vao chieu rong hinh chu nhat");
		int b1 =scan.nextInt();
		a.seta(a1);
		a.setb(b1);
		System.out.println("dien tich hinh chu nhat la : "+ a.Dientich());
		System.out.println("chu vi hinh chu nhat la : " +a.ChuVi());
		hinhtron b = new hinhtron();
		System.out.println("nhap vao ban kinh hinh tron");
		int b2= scan.nextInt();
		b.setb(b2);
		System.out.println("dien tich hinh tron la : "+ b.Dientich());
		System.out.println("chu vi hinh chu tron la : " +b.ChuVi());
		hinhvuong c = new hinhvuong();
		System.out.println("nhap vao canh a cua hinh vuong :");
		int c1= scan.nextInt();
		c.seta(c1);
		System.out.println("dien tich hinh vuong la : "+ c.Dientich());
		System.out.println("chu vi vuong la : " +c.ChuVi());
		tamgiac d= new tamgiac();
		System.out.println("nhap vao cac canh cua tam giac");
		System.out.println("nhap vao canh a");
		int d1=scan.nextInt();
		System.out.println("nhap vao canh b");
		int d2=scan.nextInt();
		System.out.println("nhap vao canh c");
		int d3=scan.nextInt();
		d.seta(d1);
		d.setb(d2);
		d.setc(d3);
		System.out.println("dien tich hinh tam giac la : "+ d.Dientich());
		System.out.println("chu vi hinh tamgiac la : " +d.ChuVi());
		

		
		
		
		
		
		
	}
	
	

}
