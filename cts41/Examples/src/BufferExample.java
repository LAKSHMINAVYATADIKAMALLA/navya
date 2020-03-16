import java.io.*;
public class BufferExample
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		try(InputStreamReader ipr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ipr))
{
	System.out.println("enter your name");
	String name=br.readLine();
	System.out.println("enter your city");
	String city=br.readLine();
	System.out.println("the name is:"+name);
	System.out.println("the city is:"+city);
}

	}

}
