import java.util.Scanner;
public class main {
	public static void main(String [] arg)
	{
		Scanner scan = new Scanner(System.in);
		
		PhanSo a =new PhanSo();
		PhanSo b = new PhanSo();
		System.out.println("nhap vao phan so thu 1");
		int tu1= scan.nextInt();
		int mau1;
		 mau1 =scan.nextInt();
		
		System.out.println("nhap vao phan so thu 2");
		int tu2 =scan.nextInt();
		int mau2;
	
		 mau2 =scan.nextInt();
	
		a.setX(tu1);
		a.setY(mau1);
		b.setX(tu2);
		b.setY(mau2);
		System.out.println(" cong hai phan so");
		System.out.println(a.Tong(b).getX() +"/" +a.Tong(b).getY());
		System.out.println(" tru hai phan so");
		System.out.println(a.Hieu(b).getX() +"/" +a.Hieu(b).getY());
		System.out.println(" nhan hai phan so");
		System.out.println(a.Tich(b).getX() +"/" +a.Tich(b).getY());
		System.out.println(" thuong hai phan so");
		System.out.println(a.Thuong(b).getX() +"/" +a.Thuong(b).getY());
		System.out.println(" toi uu phan so a");
		System.out.println(a.Toi_Gian().getX() +"/" +a.Toi_Gian().getY());
	
	}

}
