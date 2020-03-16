import java.util.*;

public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		ArrayList<String> ar=new ArrayList<String>();
		m.put(1001,"hiI" );
		m.put(1002,"hellO" );
		m.put(1003,"vanakam");
		Set Keys=m.entrySet();
		Iterator itr=Keys.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			String str=(String)entry.getValue();
			if(str.charAt(0)>=97&&
				str.charAt(0)<=123&&
				str.charAt(str.length()-1)>=65&&
				str.charAt(str.length()-1)<=90)
			{
				ar.add(str);
			}
				
		}
		System.out.println("the name satisfying the condition are:");
		for(String c:ar)
		{
			System.out.println(c);
		}

	}

}
