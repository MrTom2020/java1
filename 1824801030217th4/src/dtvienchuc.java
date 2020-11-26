
public class dtvienchuc extends vienchuc
{
	private String Hoten = "",diachi = "",trinhdo = "",namsinh ="",loai = "";
	private float diemngoaingu = 0,diemquanlynhanuoc = 0;
	@Override
	protected String getHoten() 
	{
		// TODO Auto-generated method stub
		return this.Hoten;
	}
	public dtvienchuc()
	{
		
	}
	public dtvienchuc(String hoten,String diachi,String trinhdo,String namsinh,float diemtienganh,float diemql,String loai)
	{
		this.Hoten = hoten;
		this.diachi = diachi;
		this.namsinh = namsinh;
		this.trinhdo = trinhdo;
		this.diemngoaingu = diemtienganh;
		this.diemquanlynhanuoc = diemql;
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
	protected String getnamsinh() {
		// TODO Auto-generated method stub
		return this.namsinh;
	}

	@Override
	protected void setnamsinh(String namsinh) 
	{
		// TODO Auto-generated method stub
		this.namsinh = namsinh;
	}
	public float getdiemtienganh()
	{
		return this.diemngoaingu;
	}
	public float getdiemqlnn()
	{
		return this.diemquanlynhanuoc;
	}
	public void setdiemtienganh(float diemtienganh)
	{
		this.diemngoaingu = diemtienganh;
	}
	public void setdiemqlnn(float diemql)
	{
		this.diemquanlynhanuoc = diemql;
	}
	@Override
	protected String getloai() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected void setloai(String loai) {
		// TODO Auto-generated method stub
		
	}

}
