import java.util.Scanner;
public class bai1 {
	public static void main(String arg[])
	{
		Scanner scan= new Scanner(System.in);
		Point x= new Point();
		Point y = new Point();
		
		System.out.println("nhap vao toa do cua diem X");
		int x1 = scan.nextInt();
		int y1=scan.nextInt();
		System.out.println("nhap vao toa do cua diem Y");
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		x.setX(x1);
		x.setY(y1);
		y.setX(x2);
		y.setY(y2);
		System.out.println("tinh khoang cach giua 2 toa do :" + x.Khoangcach(y));
		
		
		
	}

}
