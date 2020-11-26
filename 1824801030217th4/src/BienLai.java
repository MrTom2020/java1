

public class BienLai extends KhachHang{
	public float CScu, CSmoi, Sotien;
	public BienLai() {
		
	}
	public BienLai(String Hoten, String Sonha, String MaSCT, float CScu, float CSmoi, float Sotien) {
		super(Hoten, Sonha, MaSCT);
		this.CScu=CScu; this.CSmoi=CSmoi; this.Sotien=Sotien;
	}
}