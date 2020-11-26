
public class tapchi implements tailieu 
{

	private String MTL = "",TenNXB = "",soxb = "",loai ="";
	private int so_phat_hanh = 0,thangphathanh = 0;
	@Override
	public void xuat() 
	{
		System.out.println(this.getMatailieu() + "\t " + this.getTenNXB() + "\t\t\t " + this.getsophathanh() + "\t\t\t " + this.getloai());
	}
	public tapchi()
	{
		
	}
	public tapchi(String MTL,String TNXB,String SOXB,String loai,int soph,int thangph)
	{
		this.MTL = MTL;
		this.TenNXB = TNXB;
		this.soxb = SOXB;
		this.loai = loai;
		this.so_phat_hanh = soph;
		this.thangphathanh = thangph;
	}
	public int getso_phat_hanh()
	{
		return this.so_phat_hanh;
	}
	public void setsophathanh(int sph)
	{
		this.so_phat_hanh = sph;
	}
	public int getthangphathanh()
	{
		return this.thangphathanh;
	}
	public void setthangphathanh(int tph)
	{
		this.thangphathanh = tph;
	}
	public String getloai()
	{
		return this.loai;
	}
	public void setloai(String loai)
	{
		this.loai = loai;
	}
	public String getMatailieu()
	{
		return this.MTL;
	}
	public void setMatailieu(String mtl)
	{
		this.MTL = mtl;
	}
	public String getTenNXB()
	{
		return this.TenNXB;
	}
	public void setTenNXB(String tnxb)
	{
		this.TenNXB = tnxb;
	}
	public String getsophathanh()
	{
		return this.soxb;
	}
	public void setsophathanh(String soph)
	{
		this.soxb = soph;
	}
	
}
