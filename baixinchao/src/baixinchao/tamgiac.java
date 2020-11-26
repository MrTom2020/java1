package baixinchao;

public class tamgiac  extends hinh
{

	private float a,b,c,s;
	public tamgiac(float A,float B,float C)
	{
		this.a = A;
		this.b = B;
		this.c = C;
	}
	@Override
	protected float dientich() 
	{
		// TODO Auto-generated method stub
		s = (float)(a + b + c)/2;
		float ss = (s*(s- a)*(s - b) * (s - c));
		return (float)Math.sqrt(ss);
	}

	@Override
	public float chuvi() {
		// TODO Auto-generated method stub
		return a + b + c;
	}
	
}
