package bai5;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner scan = new Scanner( System.in);
		System.out.println(" nhap vao so hinh");
		n =scan.nextInt();
		Hinh2D a[] = new Hinh2D[n];
		int x;
		for(int i=0;i<n;i++)
		{
			System.out.println("1: hinh chu nhat "+"\n"+"2 : hinh cuong "+"\n"+"3: hinh tron"+"\n"+"4: hinh tam giac"+"\n"+"6: moi ban chon");
			x = scan.nextInt();
			if (x==1)
			{
				a[i] = new HinhChuNhat();
				a[i].nhapThongTin();
				
			}
			if(x==2)
			{
				a[i] = new hinhvuong();
				a[i].nhapThongTin();
			}
			if(x==3)
			{
				a[i] = new HinhTron();
				a[i].nhapThongTin();
				
			}
			if(x==4)
			{
				a[i]= new TamGiac();
				a[i].nhapThongTin();
			}
		}
		// in chu vi va dien tich cac hinh
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i].getName()+ "\t"+a[i].chuVi()+"\t" +a[i].dienTich());
		}
		int dem1=0,dem2=0,dem3=0,dem4=0;
		for(int i=0;i<n;i++)
		{
			if(a[i].getName()=="Hinh Chu Nhat")
			{
				dem1=dem1+1;
			}
			if(a[i].getName()=="Hinh Vuong")
			{
				dem2=dem2+1;
			}
			if(a[i].getName()=="Hinh Tron")
			{
				dem3=dem3+1;
			}
			if(a[i].getName()=="Tam Giac")
			{
				dem4=dem4+1;
			}
			
			
		}
		System.out.println(" so hinh chu nhat la : " + dem1 +"\n" +"so hinh vuong la :"+dem2+"\n"+"so hinh tron la :"+dem3+"\n"+"so hinh tam giac la :"+dem4);
		Point search = new Point();
		System.out.println(" nhap toa do x");
		search.setX(scan.nextInt());
		System.out.println(" nhap toa do y");
		search.setY(scan.nextInt());
		int count =0;
		for(int i=0;i<n;i++)
		{
			if(a[i].laDiemBenTrong(search))
			{
				System.out.println(" la diem thuoc "+a[i].getName()+"thu"+i);
				count =count+1;
			}
		}
		if(count==0)
		{
			System.out.println("toa do do khong co trong danh sach hinh");
		}
		

	}

}
