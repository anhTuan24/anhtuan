package tuan01;

import java.util.Scanner;

public class Test {
	static Scanner nhap = new Scanner(System.in);
	public static void main(String[] args) {
		Tieude();
		NhapCung();
		
		SinhVien sv3 = NhapMem();
		Tieude();
		System.out.println(sv3);
	}
	static void Tieude() {
		String s = "";
		s +=String.format("%6s%20s%10s%10s%10s","MaSV","HoTen","DiemLT","DiemTH","DiemTB");
		System.out.println(s);
	}
	static void NhapCung() {
		SinhVien sv2 = new SinhVien();
		SinhVien sv1 = new SinhVien(1,"Nguyen Van A",7.5f,8.0f);
		System.out.println(sv1);
		System.out.println(sv2);
		
	}
	static SinhVien NhapMem() {
		int maSV;
		String hoTen;
		float diemLT,diemTH;
		System.out.println("moi nhap ma sinh vien");
		maSV = nhap.nextInt();
		System.out.println("moi nhap ho ten");
		nhap.nextLine();
		hoTen = nhap.nextLine();
		System.out.println("moi nhap diem ly thuyet va thuc hanh");
		diemLT = nhap.nextFloat();
		diemTH = nhap.nextFloat();
		SinhVien sv3 = new SinhVien(maSV,hoTen,diemLT,diemTH);
		return sv3;
	}
	
}
