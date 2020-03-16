import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {


public static void main(String[]args)
{
	ArrayList ar=new ArrayList();
	ar.add("java");
	ar.add("selenium");
	ar.add("oracel");

	System.out.println(ar);
	Iterator ir=ar.iterator();
	System.out.println(ir.next());
	
	
	
}
}
