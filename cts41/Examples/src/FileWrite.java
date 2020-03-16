import java.io.*;
public class FileWrite 
{

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		// TODO Auto-generated method stub
		char ch;
		int x;
		try(FileReader fin=new FileReader("d://Fileresult.txt");
				FileWriter fout=new FileWriter("d://file.txt"))
						{
					x=fin.read();
					while(x!=-1)
					{
						ch=(char)x;
						fout.write(ch);
						System.out.println(ch);
						x=fin.read();
					}
						}

	}

}
