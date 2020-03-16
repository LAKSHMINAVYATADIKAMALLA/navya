package Annotations;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTennisConfig 
{
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("ApplicationContextTenni.xml");
		TennisCoach tcoach=context.getBean(TennisCoach.class);
		//here we r explicitly giving bean name and passing that thru the class name
		FootBallCoach fcoach=context.getBean("footBallCoach",FootBallCoach.class);
		System.out.println(tcoach.getDailyWorkout());
		fcoach.show();
		context.close();
	}

}
