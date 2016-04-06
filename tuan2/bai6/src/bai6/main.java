package bai6;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B,C;
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao A xe Pedion");
		A=scan.nextInt();
		System.out.println("nhap vao B xe Zattacker");
		B=scan.nextInt();
		System.out.println("nhap vao C xe Carier");
		C=scan.nextInt();
		System.out.println(" Doan robot Pedion");
		Pedion a[] = new Pedion[A];
		for(int i=0;i<A;i++)
		{
			a[i]= new Pedion();
			System.out.println("con Pedion thu " + i);
			System.out.println("M : "+ a[i].getM()+ "\t" + "F:"+a[i].getF() +"\t"+"Nang luong : "+a[i].nangluong(10));
		}
		System.out.println(" Doan robot Zattacker");
		Zattacker b[] = new Zattacker[B];
		for(int i=0;i<B;i++)
		{
			b[i]= new Zattacker ();
			System.out.println("con Zattacker thu " + i);
			System.out.println("M : "+ b[i].getM()+"\t"+"F:"+b[i].getP() +"\t"+"Nang luong : "+b[i].nangluong(10));
		}
		
		System.out.println(" Doan robot Carier");
		Carrier c[] = new Carrier[C];
		for(int i=0;i<C;i++)
		{
			c[i]= new Carrier();
			System.out.println("con Carrier thu " + i);
			System.out.println("M : "+ c[i].getM()+"\t"+"F:"+c[i].getE() +"\t"+"Nang luong : "+c[i].nangluong(10));
		}
		// cau b
		double max1=0,max2=0,max3=0;
		double tong1=0,tong2=0,tong3=0;
		for(int i=0;i<A;i++)
		{
			tong1=tong1 + a[i].nangluong(10);
			if (a[i].nangluong(10)>max1)
				max1=a[i].nangluong(10);
		}
		for(int j=0;j<B;j++)
		{
			tong2=tong2+ b[j].nangluong(10);
			if (b[j].nangluong(10)>max2)
				max2=b[j].nangluong(10);
		}
		for(int k=0;k<C;k++)
		{
			tong3=tong3 + c[k].nangluong(10);
			if (c[k].nangluong(10)>max3)
				max3=c[k].nangluong(10);
		}
		if (max1 > max2 && max1 >max3)
		{
			System.out.println(" con robot co nang luong lon nhat la Pedion");
		}
		else
		{
			if (max2>max1 && max2>max3)
			{
				System.out.println(" con robot co nang luong lon nhat la Zattacker");
			}
			else
			{
				if (max3 >max1 && max3 >max2)
				{
					System.out.println(" con robot co nang luong lon nhat la Carrier");
				}
			}
		}
		// cau c
		double tong =tong1+tong2+tong3;
		System.out.println(" tong nang luong tieu thu cua don robot la "+ tong);
	}	
		
}
