import java.util.function.*;
public class BiFunctionExamples {
	public static void main(String[]args)
	{
		BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b);
		BiFunction<Integer,Integer,Integer> sub=(a,b)->(a-b);
		BiFunction<Integer,Integer,Integer> prod=(a,b)->(a*b);
		System.out.println("the sum is"+add.apply(10, 20));
		System.out.println("the diff is"+sub.apply(10, 2));
		System.out.println("the mul is"+prod.apply(10, 20));




	}

}
