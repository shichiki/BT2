package bai10;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int n=0;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
			System.out.println("1 : nhap hoc sinh "+"\n"+"2: nhap sinh vien"+"\n"+"3: nhap cong nhan"+"\n"+"4: nhap ca si"+"\n"+"5: nhap nghe si");
			n=scan.nextInt();
			scan.nextLine();
			HocSinh a= new HocSinh();
			SinhVien  b= new SinhVien();
			CaSi c = new CaSi();
			NgheSi d = new NgheSi();
			CongNhan g = new CongNhan();
			
			if (n==1)
			{
				
				System.out.println(" nhap vao ten hoc sinh"+"\n");
				a.set_ten(scan.nextLine()+"\n");
				System.out.println("nhap vao tuoi hoc sinh");
				a.set_tuoi(scan.nextInt());
				scan.nextLine();// tranh troi scanner
				System.out.println("nhap vao ten truong cua hoc sinh");
				a.set_Truong(scan.nextLine());
				System.out.println("nhap vao  ma so hoc sinh");
				a.set_MSSV(scan.nextInt());
				scan.nextLine();
				System.out.println(" in thong tin hoc sinh");
				System.out.println(a.get_ten()+ "\t"+a.get_tuoi()+"\t"+a.get_truong()+"\t"+a.get_MSSV());
			}
			if (n==2)
			{
				System.out.println(" nhap vao ten sinh vien");
				b.set_ten(scan.nextLine());
				scan.nextLine();
				System.out.println("nhap vao ma so sinh vien ");
				b.set_MSSV(scan.nextInt());
				scan.nextLine();
				System.out.println("nhap vao tuoi cua sinh vien");
				b.set_tuoi(scan.nextInt());
				scan.nextLine();
				System.out.println(" in thong tin sinh vien");
				System.out.println(b.get_ten()+"\t"+b.get_MSSV()+"\t"+b.get_tuoi()+"\n");
				
			}
			if(n==3)
			{
				System.out.println(" nhap vao ten cong nhan");
				g.set_ten(scan.nextLine());
				scan.nextLine();
				System.out.println("nhap vao tuoi cua cong nhan");
				g.set_tuoi(scan.nextInt());
				scan.nextLine();
				System.out.println(" nhap vao nganh cua cong nhan");
				g.set_Nganh(scan.nextLine());
				scan.nextLine();
				System.out.println("nhap vao ma cong nhan");
				g.set_MaCN(scan.nextInt());
				scan.nextLine();
				System.out.println(" in thong tin cong nhan");
				System.out.println(g.get_ten()+"\t"+g.get_tuoi()+"\t"+g.get_Nganh()+"\t"+g.get_MACN()+"\n");
			}
			if (n==4)
			{
				
				System.out.println("nhap vao tuoi cua ca si");
				c.set_tuoi(scan.nextInt());
				scan.nextLine();
				System.out.println(" nhap vao ten ca si");
				c.set_ten(scan.nextLine());
				scan.nextLine();
				System.out.println("bai hat ca si do hat");
				c.st_baihat(scan.nextLine());
				scan.nextLine();
				System.out.println(" in thong tin ca si");
				System.out.println(c.get_ten()+"\t"+c.get_tuoi()+"\t"+c.get_baihat());
				
			}
			if (n==5)
			{
				System.out.println(" nhap vao ten nghe si");
				d.set_ten(scan.nextLine());
				scan.nextLine();
				System.out.println("nhap vao tuoi cua nghe si");
				d.set_tuoi(scan.nextInt());
				scan.nextLine();
				System.out.println("nhap vao linh vuc hoat dong");
				d.set_linhvuc(scan.nextLine());
				System.out.println(" in thong tin nghe si");
				System.out.println(d.get_ten()+"\t"+d.get_tuoi()+"\t"+d.get_linhvuc()+"\n");
			}
	}

}
