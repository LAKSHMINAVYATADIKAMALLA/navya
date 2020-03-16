import java.util.function.*;
import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[]args)
	{
		BiPredicate<Integer,Integer>bi=(a,b)->(a+b)%2==0;
		System.out.println(bi.test(10, 2));
		System.out.println(bi.test(1, 1));
		System.out.println(bi.test(1, 2));
	}

}
