package baixinchao;

public class chunhat extends hinh
{
	private float c,r;
	public chunhat(float a,float b)
	{
		this.c = a;
		this.r = b;
	}
	
	public float dientich()
	{
		return r *c;
	}
	public float chuvi()
	{
		return (float)(r + c) /2;
	}
	
}
