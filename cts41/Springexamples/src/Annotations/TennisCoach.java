package Annotations;

import org.springframework.stereotype.Component;

@Component("myCoach")

public class TennisCoach 
{
	public String getDailyWorkout()
	{
		return "Practice Your Backhand Volly";
	}

}
