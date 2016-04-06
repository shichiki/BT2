package bai9;
import java.util.Scanner;

public class bai9 {
	public static void main(String [] arg)
	{
		Scanner scan = new Scanner(System.in);
		nhanvienvanphong a = new nhanvienvanphong();
		System.out.println(" nhap vao nhan vien van phong");
		System.out.println("nhap vao ten nhan vien");
		a.set_ten(scan.next());
		scan.nextLine();
		System.out.println("nhap vao ngay sinh cua nhan vien");
		a.set_ngaysinh(scan.next());
		scan.nextLine();
		System.out.println("nhap vao so ngay lam viec cua nhan vien");
		a.set(scan.nextInt());
		scan.nextLine();
		System.out.println(" so tien luong nhan vien van phong :" +a.tinhluong());
		nhanviensanxuat b = new nhanviensanxuat();
		
		System.out.println(" nhap vao nhan vien san xuat");
		System.out.println("nhap vao ten nhan vien");
		b.set_ten(scan.next());
		scan.nextLine();
		System.out.println("nhap vao ngay sinh cua nhan vien");
		b.set_ngaysinh(scan.next());
		scan.nextLine();
		System.out.println(" nhap vao muc luong co ban");
		b.set_luong(scan.nextInt());
		scan.nextLine();
		System.out.println(" nhap vao so san pham ");
		b.set_sosanpham(scan.nextInt());
		scan.nextLine();
		System.out.println(" so tien luong nhan vien sanxuat :" +b.tinhtien());
		
		
		
	}

}
