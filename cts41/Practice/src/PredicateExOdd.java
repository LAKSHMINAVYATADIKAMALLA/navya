import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExOdd 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Predicate<Integer> p1=(a)->(a)%2!=0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(1));
		System.out.println(p1.test(1));
		Function<Integer,Double> area =(r)->(3.14*r*r);
		System.out.println(area.apply(4));

	}

}
