
public abstract class vienchuc
{
	protected String Hoten = "",diachi = "",trinhdo = "",namsinh ="",loai ="";
	public vienchuc()
	{
		
	}
	public vienchuc(String hoten,String diachi,String trinhdo,String namsinh,String loai)
	{
		this.Hoten = hoten;
		this.diachi = diachi;
		this.namsinh = namsinh;
		this.trinhdo = trinhdo;
		this.loai = loai;
	}
	protected abstract String getHoten();
	protected abstract void setHoten(String hoten);
	protected abstract String getdiachi();
	protected abstract void setdiachi(String diachi);
	protected abstract String gettrinhdo();
	protected abstract void settrinhdo(String trinhdo);
	protected abstract String getnamsinh();
	protected abstract void setnamsinh(String namsinh);
	protected abstract String getloai();
	protected abstract void setloai(String loai);
}
