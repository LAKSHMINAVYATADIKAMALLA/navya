import java.util.function.BiFunction;

public class BiFunUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,Student>bi=(htno,name)->new Student(htno,name);
		Student s1=bi.apply("1001", "praveen");
		System.out.println(s1);
		
		BiConsumer<String,String>c1=(a,b)->System.out.println(a+b);
	}

}
