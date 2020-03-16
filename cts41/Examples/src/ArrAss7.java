import java.util.ArrayList;

public class ArrAss7 {
	public static void main(String[]args)
	{
		ArrayList ar=new ArrayList();
		ar.add("java");
		ar.add("selenium");
		ar.add("oracel");

		System.out.println(ar);
		ar.contains("selenium");
		if(ar.contains("selenium"))
				System.out.println("true");
		else
				System.out.println("false");
	}

}
