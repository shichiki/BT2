package bai11;

import java.util.Scanner;

public class CongNhan extends Nguoi {
	private String Nganh;
	private int MaCN;
	public CongNhan()
	{
		Nganh="May";
		MaCN=1352056;
	}
	public String get_Nganh()
	{
		return Nganh;
	}
	public int get_MACN()
	{
		return MaCN;
	}
	public void set_Nganh(String nganh)
	{
		Nganh=nganh;
	}
	public void set_MaCN(int macn)
	{
		MaCN=macn;
	}
	public void nhapthongtin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" nhap vao ten cong nhan");
		set_ten(scan.nextLine());
		scan.nextLine();
		System.out.println("nhap vao tuoi cua cong nhan");
		set_tuoi(scan.nextInt());
		scan.nextLine();
		System.out.println(" nhap vao nganh cua cong nhan");
		set_Nganh(scan.nextLine());
		scan.nextLine();
		System.out.println("nhap vao ma cong nhan");
		set_MaCN(scan.nextInt());
		scan.nextLine();
		
	}
	public void xuatthongtin()
	{
		System.out.println(" in thong tin cong nhan");
		System.out.println(get_ten()+"\t"+get_tuoi()+"\t"+get_Nganh()+"\t"+get_MACN()+"\n");
	}

}
