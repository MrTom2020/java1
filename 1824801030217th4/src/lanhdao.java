
public class lanhdao  extends vienchuc
{
	private String Hoten = "",diachi = "",trinhdo = "",namsinh ="",loai = "";
	private float diemtutuong = 0,diemlyluan = 0;
	@Override
	protected String getHoten() {
		// TODO Auto-generated method stub
		return this.Hoten;
	}

	@Override
	protected void setHoten(String hoten)
	{
		// TODO Auto-generated method stub
		this.Hoten = hoten;
	}

	@Override
	protected String getdiachi() {
		// TODO Auto-generated method stub
		return this.diachi;
	}

	@Override
	protected void setdiachi(String diachi) {
		// TODO Auto-generated method stub
		this.diachi = diachi;
		
	}

	@Override
	protected String gettrinhdo() {
		// TODO Auto-generated method stub
		return this.trinhdo;
	}

	@Override
	protected void settrinhdo(String trinhdo)
	{
		// TODO Auto-generated method stub
		this.trinhdo = trinhdo;
	}

	@Override
	protected String getnamsinh()
	{
		// TODO Auto-generated method stub
		return this.namsinh;
	}
	public lanhdao()
	{
		
	}
	public lanhdao(String hoten,String diachi,String trinhdo,String namsinh,float diemtutuong,float diemll,String loai)
	{
		this.Hoten = hoten;
		this.diachi = diachi;
		this.namsinh = namsinh;
		this.trinhdo = trinhdo;
		this.diemtutuong = diemtutuong;
		this.diemlyluan = diemll;
		this.loai = loai;
	}
	@Override
	protected void setnamsinh(String namsinh) 
	{
		// TODO Auto-generated method stub
		this.namsinh = namsinh;
	}
	public float gettutuong()
	{
		return this.diemtutuong;
	}
	public void setdiemtutuong(float diemtutuong)
	{
		this.diemtutuong = diemtutuong;
	}
	public float getdiemlyluan()
	{
		return this.diemlyluan;
	}
	public void setlyluan(float diemll)
	{
		this.diemlyluan = diemll;
	}

	@Override
	protected String getloai() {
		// TODO Auto-generated method stub
		return this.loai;
	}

	@Override
	protected void setloai(String loai) {
		// TODO Auto-generated method stub
		this.loai = loai;
	}

}
