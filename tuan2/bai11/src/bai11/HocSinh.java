package bai11;
import java.util.Scanner;


public class HocSinh  extends Nguoi{
	
	private int MSHS;
	private String Truong;
	public HocSinh()
	{
		MSHS=123;
		Truong="THPT Hoa Binh";
	}
	public void set_MSSV(int mssv)
	{
		MSHS=mssv;
	}
	public int get_MSSV()
	{
		return MSHS;
	}
	public String get_truong()
	{
		return Truong;
	}
	public void  set_Truong(String truong)
	{
		Truong=truong;
	}
	public void nhapthongtin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" nhap vao ten hoc sinh"+"\n");
		set_ten(scan.nextLine()+"\n");
		System.out.println("nhap vao tuoi hoc sinh");
		set_tuoi(scan.nextInt());
		scan.nextLine();// tranh troi scanner
		System.out.println("nhap vao ten truong cua hoc sinh");
		set_Truong(scan.nextLine());
		System.out.println("nhap vao  ma so hoc sinh");
		set_MSSV(scan.nextInt());
		scan.nextLine();
	}
	public void xuatthongtin()
	{
		
		System.out.println(get_ten()+ "\t"+get_tuoi()+"\t"+get_truong()+"\t"+get_MSSV());
	}

}