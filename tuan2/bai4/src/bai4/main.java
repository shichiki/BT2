package bai4;
import java.util.Scanner;


public class main {
	public  static void main(String [] arg)
	{
		Scanner scan = new Scanner(System.in);
		honso a= new honso();
		honso b = new honso();
		System.out.println("nhap vao hon so thu nhat");
		a.sethonso(scan.nextInt());
		a.setX(scan.nextInt());
		a.setY(scan.nextInt());
		System.out.println("nhap vao hon so thu hai");
		b.sethonso(scan.nextInt());
		b.setX(scan.nextInt());
		b.setY(scan.nextInt());
		honso kq1=a.cong(b);
		System.out.println("cong hai hon so la : "+ kq1.gethonso() +"*"+ kq1.getX()+"/"+kq1.getY());
		honso kq2=a.Tru(b);
		System.out.println("tru hai hon so la : "+ kq2.gethonso() +"*"+ kq2.getX()+"/"+kq2.getY());
		honso kq3=a.Nhan(b);
		System.out.println("nhan hai hon so la : "+ kq3.gethonso() +"*"+ kq3.getX()+"/"+kq3.getY());
		honso kq4=a.Chia(b);
		System.out.println("chia hai hon so la : "+ kq4.gethonso() +"*"+ kq4.getX()+"/"+kq4.getY());
		
	}
	
}
