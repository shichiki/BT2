package bai11;

import java.util.Scanner;
import java.util.Scanner;

public class CaSi extends Nguoi {
	public String Baihat;
	public CaSi()
	{
		Baihat="Yeu Don Phuong";
	}
	public void st_baihat(String baihat)
	{
		Baihat=baihat;
	}
	public String get_baihat()
	{
		return Baihat;
	}
	public void nhapthongtin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao tuoi cua ca si");
		set_tuoi(scan.nextInt());
		scan.nextLine();
		System.out.println(" nhap vao ten ca si");
		set_ten(scan.nextLine());
		scan.nextLine();
		System.out.println("bai hat ca si do hat");
		st_baihat(scan.nextLine());
		scan.nextLine();
		
	}
	public void xuatthongtin()
	{
		System.out.println(" in thong tin ca si");
		System.out.println(get_ten()+"\t"+get_tuoi()+"\t"+get_baihat());
	}

}
