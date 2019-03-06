
public class DriverExam 
{
	private char[] correctAnswers;
	
	public DriverExam(char[] answers)
	{
		correctAnswers = answers;
	}
	
	public int totalCorrect(char[] studentAnswers)
	{
		int incorrect = 0;
		
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(correctAnswers[i] != studentAnswers[i])
			{
				incorrect++;
			}
			
		return incorrect;
		
		}
	}
	
}
