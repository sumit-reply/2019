package java.codechalange.data;

public class Output
{
	int x;
	int y;
	String path;

	public Output(final int x, final int y, final String path)
	{
		this.x = x;
		this.y = y;
		this.path = path;
	}

	public int getX()
	{
		return x;
	}

	public void setX(final int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(final int y)
	{
		this.y = y;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(final String path)
	{
		this.path = path;
	}
}
