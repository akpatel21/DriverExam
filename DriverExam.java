
public class DriverExam 
{
	private char[] correctAnswers;
	
	public DriverExam(char[] answers)
	{
		correctAnswers = answers;
	}
	
	public int totalCorrect(char[] studentAnswers)
	{
		int correct = correctAnswers.length;
		
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(correctAnswers[i] != studentAnswers[i])
			{
				correct--;
			}	
		}
		
		return correct;
		
	}
	
	public int totalIncorrect(char[] studentAnswers)
	{
		return correctAnswers.length - totalCorrect(studentAnswers);
	}
	
	public boolean passed(char[] studentAnswers)
	{
		if(((double) totalCorrect(studentAnswers))/correctAnswers.length >= 0.75)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int[] questionsMissed(char[] studentAnswers)
	{
		int[] questionsMissed = new int[totalIncorrect(studentAnswers)];
		int arrayIndex = 0;
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(correctAnswers[i] != studentAnswers[i])
			{
				questionsMissed[arrayIndex] = i + 1;
				arrayIndex++;
			}
		}
		
		return questionsMissed;
	}
	
}
