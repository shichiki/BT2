package bai11;

import java.util.Scanner;

public class NgheSi extends Nguoi{
	private  String LinhVucNgheThuat;
	public NgheSi()
	{
		LinhVucNgheThuat="Ca Hat";
	}
	public void set_linhvuc(String linhvuc)
	{
		LinhVucNgheThuat=linhvuc;
	}
	public String get_linhvuc()
	{
		return LinhVucNgheThuat;
	}
	public void nhapthongtin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" nhap vao ten nghe si");
		set_ten(scan.nextLine());
		scan.nextLine();
		System.out.println("nhap vao tuoi cua nghe si");
		set_tuoi(scan.nextInt());
		scan.nextLine();
		System.out.println("nhap vao linh vuc hoat dong");
		set_linhvuc(scan.nextLine());
		System.out.println(" in thong tin nghe si");
	}
	public void xuatthongtin()
	{
		
		System.out.println(get_ten()+"\t"+get_tuoi()+"\t"+get_linhvuc()+"\n");
	}

}