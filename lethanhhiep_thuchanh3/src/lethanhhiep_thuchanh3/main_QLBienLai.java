package lethanhhiep_thuchanh3;

import java.util.ArrayList;
import java.util.Scanner;

public class main_QLBienLai {
	static Scanner Inln= new Scanner(System.in);
	static Scanner Inf=new Scanner(System.in);
	static ArrayList<BienLai> listBL=new ArrayList<BienLai>();
	static BienLai kh;
	static String Hoten, Sonha, MaSCT;
	static float CScu, CSmoi, Sotien;
	
	static void nhap() {
		System.out.print("Nhap ho ten ng: "); Hoten=Inln.nextLine();
		System.out.print("nhap ma khach hang ng: "); Sonha=Inln.nextLine();
		System.out.print("Nhap ma SCT¡: "); MaSCT=Inln.nextLine();
		System.out.print("Nhap CS cu: "); CScu=Inf.nextFloat();
		System.out.print("Nhap co so moi: "); CSmoi=Inf.nextFloat();
		if((CSmoi-CScu)<=50) Sotien=((CSmoi-CScu)*(float)1.484);
		else if((CSmoi-CScu)<=100) Sotien=((CSmoi-CScu)*(float)1.533);
		else if((CSmoi-CScu)<=200) Sotien=((CSmoi-CScu)*(float)1.786);
		else if((CSmoi-CScu)<=300) Sotien=((CSmoi-CScu)*(float)2.242);
		else if((CSmoi-CScu)<=400) Sotien=((CSmoi-CScu)*(float)2.503);
		else Sotien=((CSmoi-CScu)*(float)2.587);
	}
	
	static void nhapds() {
		int n;
		System.out.print("Nhap so luong khach hang ng: "); n=Inf.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap khach thu "+(i+1)+":");
			nhap();
			kh=new BienLai(Hoten, Sonha, MaSCT, CScu, CSmoi, Sotien);
			listBL.add(kh);
		}
	}
	
	static void xuatds() {
		System.out.println("Danh sach khach hang: ");
		System.out.println("STT |   |      Ho ten||     Ma kh     ||  Ma sct    ||    CS cu      | |   CSO Moi   ||   So tien   |");
		for(int i=0;i<listBL.size();i++) {
			kh=listBL.get(i);
			System.out.println((i+1)+"\t "+kh.Hoten+"\t "+kh.Sonha+"\t\t "+kh.MaSCT+"\t\t "+kh.CScu+"\t\t "+kh.CSmoi+"\t\t "+kh.Sotien);
		}
	}
	
	public static void main(String[] args) {
		nhapds();
		xuatds();
	}
}
