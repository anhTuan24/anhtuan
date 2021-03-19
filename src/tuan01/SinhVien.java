package tuan01;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT, diemTH;
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public SinhVien() {
		super();
	}
	public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public float tinhDTB() {
		float diemTB;
		diemTB = (getDiemLT()+ getDiemTH())/2;
		return diemTB;
	}
	@Override
	public String toString() {
		String s= "";
		s += String.format("%6d%20s%10.2f%10.2f%10.2f",getMaSV(),getHoTen(),getDiemLT(),getDiemTH(),tinhDTB());
		return s;
	}
	
	
}
