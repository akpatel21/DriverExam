
public class DriverExamTest 
{

	public static void main(String[] args) 
	{
		char[] arr1 = {'a', 'b', 'c', 'd', 'e'};
		DriverExam test = new DriverExam(arr1);
		
		char[] arr2 = {'b','b','c','c','e'};
		
		int[] arr3;;
		System.out.println(test.totalCorrect(arr2));
		System.out.println(test.totalIncorrect(arr2));
		System.out.println(test.passed(arr2));
		arr3 = test.questionsMissed(arr2);
		for(int i = 0; i < arr3.length; i++)
		{
			System.out.println(arr3[i]);
		}
		
	}

}
