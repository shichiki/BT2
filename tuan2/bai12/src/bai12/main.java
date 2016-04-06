package bai12;
import java.util.Scanner;

public   class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		
		Scanner scan= new Scanner(System.in);
		System.out.println("nhap vao so bo");
		int n= scan.nextInt();
		System.out.println("nhap vao so cuu");
		int m= scan.nextInt();
		System.out.println("nhap vao so de");
		int p= scan.nextInt();
		if (n>0)
		{
			System.out.println(" co bo doi");
			Bo a = new Bo();
			System.out.println(a.tiengkeu());
			
		}
		if (m>0)
		{
			System.out.println(" co cuu doi");
			Cuu a = new Cuu();
			System.out.println(a.tiengkeu());
			
		}
		if (p>0)
		{
			System.out.println(" co de doi");
			De a = new De();
			System.out.println(a.tiengkeu());
			
		}
		// xong cau a
		Bo a[] = new Bo[n];
		Cuu b[] = new Cuu[m];
		De c[] = new De[p];
		int sua=0;
		int soloaigiasuc=0;
		int suabo=0;
		int bocon=0;
		int suade=0;
		int decon=0;
		int suacuu=0;
		int cuucon=0;
		for(int i=0;i<n;i++)
		{
			a[i] = new Bo();
			sua=sua+a[i].soluongsua();
			soloaigiasuc=soloaigiasuc+a[i].socon;
			bocon=bocon+a[i].socon;
			suabo=suabo+a[i].soluongsua();
		}
		
		for(int i=0;i<n;i++)
		{
			b[i] = new Cuu();
			sua=sua+a[i].soluongsua();
			soloaigiasuc=soloaigiasuc+a[i].socon;
			cuucon=cuucon+a[i].socon;
			suacuu=suacuu+a[i].soluongsua;
		}
		for(int i=0;i<n;i++)
		{
			c[i] = new De();
			sua=sua+a[i].soluongsua();
			soloaigiasuc=soloaigiasuc+a[i].socon;
			decon=decon+a[i].socon;
			suade=suade+a[i].soluongsua;
		}
		soloaigiasuc=soloaigiasuc+n+m+p;
		System.out.println("  tong so luong sua la :"+sua);
		System.out.println("  tong so luong gia suc :" + soloaigiasuc );
		System.out.println(" sua bo thu duoc :"+suabo);
		System.out.println("  bo con thu duoc :" +bocon );
		System.out.println("  sua de thu duoc :"+suade);
		System.out.println("  de con thu duco :" +decon );
		System.out.println("  sua cuu thu duoc :"+suacuu);
		System.out.println("  cuu con thu duoc :" + cuucon );
		
		

	}
}

