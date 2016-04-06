package bai11;

import java.util.Scanner;

public class SinhVien extends Nguoi {
	public int MSSV;
	public SinhVien()
	{
		MSSV=13520489;
	}
	public void set_MSSV(int mssv)
	{
		MSSV=mssv;
	}
	public int get_MSSV()
	{
		return MSSV;
	}
	public void nhapthongtin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" nhap vao ten sinh vien");
		set_ten(scan.nextLine());
		scan.nextLine();
		System.out.println("nhap vao ma so sinh vien ");
		set_MSSV(scan.nextInt());
		scan.nextLine();
		System.out.println("nhap vao tuoi cua sinh vien");
		set_tuoi(scan.nextInt());
		scan.nextLine();
	
	}
	public void xuatthongtin()
	{
		System.out.println(" in thong tin sinh vien");
		System.out.println(get_ten()+"\t"+get_MSSV()+"\t"+get_tuoi()+"\n");
	}
}