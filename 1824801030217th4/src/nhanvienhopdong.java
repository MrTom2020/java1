
public class nhanvienhopdong extends vienchuc
{
	private String Hoten = "",diachi = "",trinhdo = "",namsinh ="",loai = "";
	private float diemtinhoc = 0;
	@Override
	protected String getHoten()
	{
		// TODO Auto-generated method stub
		
		return this.Hoten;
	}
	public nhanvienhopdong()
	{
		
	}
	public nhanvienhopdong(String hoten,String diachi,String trinhdo,String namsinh,float diemtinhhoc,String loai)
	{
		this.Hoten = hoten;
		this.diachi = diachi;
		this.namsinh = namsinh;
		this.trinhdo = trinhdo;
		this.diemtinhoc = diemtinhoc;
		this.loai = loai;
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
	protected void setdiachi(String diachi) 
	{
		// TODO Auto-generated method stub
		this.diachi = diachi;
	}

	@Override
	protected String gettrinhdo() 
	{
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

	@Override
	protected void setnamsinh(String namsinh) 
	{
		// TODO Auto-generated method stub
		this.namsinh = namsinh;
		
	}
	public float getdiemtinhoc()
	{
		return this.diemtinhoc;
	}
	public void setdiemtinhoc(float diemtinhoc)
	{
		this.diemtinhoc = diemtinhoc;
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
