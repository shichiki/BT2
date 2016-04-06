package bai7;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		ThueXe a[] = new ThueXe[10];
		DienThoai b[]= new DienThoai[10];
		TangBong c[] = new TangBong[10];
		int i=0;
		int j=0;
		int k=0;
		do
		{
			System.out.println(" 1 : Thue xe" + "\n"+"2: Dien Thoai "+"\n"+"3: tang bong"+"\n"+"4: Dung");
			System.out.println(" Do you want 1 ,2 or 3,4");
			n = scan.nextInt();
			if (n==1 )
			{
				a[i]= new ThueXe();
				System.out.println("nhap don gia");
				int p1=scan.nextInt();
				a[i].setdongia(p1);
				System.out.println("nhap so gio thue");
				int p2=scan.nextInt();
				a[i].set_sogiothue(p2);
				i++;
				
			}
			if (n==2)
			{
				
				b[j]=new DienThoai();
				System.out.println("nhap don gia");
				int p1=scan.nextInt();
				b[j].setdongia(p1);
				System.out.println("nhap sophut goi ");
				int p2=scan.nextInt();
				b[j].set_sogiothue(p2);
				j++;
				
			}
			if (n==3)
			{
				c[k]= new TangBong();
				System.out.println("nhap don gia");
				c[k].setdongia(scan.nextInt());
				
				System.out.println("nhap so luong bong");
				c[k].set_sogiothue(scan.nextInt());
				k++;
			}
			if (n==4)
			{
				System.out.println("Dung su dung dich vu");
				break;
			}

		}while (n <  5);
		System.out.println("dich vu co tong tien su dung cao nhat");
		System.out.println("tong tien ma ");
		for(int m=0;m<i;m++)
		{
			
		}
		for(int l=0;j<j;l++)
		{
			
		}
		for(int p=0;p<k;p++)
		{
			
		}
		System.out.println("tong tien su dung cac dich vu cua khach san la ");
		
		
		
		

	}

}
