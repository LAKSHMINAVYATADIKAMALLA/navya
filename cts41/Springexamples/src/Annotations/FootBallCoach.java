package Annotations;

import org.springframework.stereotype.Component;

@Component("footBallCoach")

public class FootBallCoach 
{
	public void show()
	{
		System.out.println("Inside the football coach");
	}
}