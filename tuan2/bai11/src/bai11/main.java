package bai11;

import java.util.Scanner;

public class main {
	public static void main(String []arg)
	{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("nhap vao so nguoi trong danh sach");
	int n = scan.nextInt();
	Nguoi a[] = new Nguoi[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("1 : nhap hoc sinh "+"\n"+"2: nhap sinh vien"+"\n"+"3: nhap cong nhan"+"\n"+"4: nhap ca si"+"\n"+"5: nhap nghe si");
		int x =scan.nextInt();
		if(x==1)
		{
			a[i]= new HocSinh();
			a[i].nhapthongtin();
			
		}
		if(x==2)
		{
			a[i]=new SinhVien();
			a[i].nhapthongtin();
		}
		if ( x==3)
		{
			a[i] = new CongNhan();
			a[i].nhapthongtin();
		}
		if (x==4)
		{
			a[i] = new CaSi();
			a[i].nhapthongtin();
		}
		if (x==5)
		{
			a[i]=new NgheSi();
			a[i].nhapthongtin();
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("nguoi thu : "+i);
		a[i].xuatthongtin();
	}
	
	}

}
