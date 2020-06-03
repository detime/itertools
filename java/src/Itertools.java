import java.util.*;


public class Itertools
{

	//словарь пользователя
	static ArrayList<String> userarraydict = new ArrayList<>();



	//добавляем из переданной пользователем строки в созданый словарь по 1 символу.
	public static Iterable<String> product(String text)
	{
		for (int i=0; i < text.length(); i++)
		{
			char gen = text.charAt(i);
			String res ="";
			res += gen;
			userarraydict.add(res);
			res = "";
		}
		return generator(1);
	}


	//вызываем добавление в словарь и возвращаем итерируемый обьект
	public static Iterable<String> product(String text, int repeat)
	{
		product(text); 
		return generator(repeat);
	}



	
	private static Iterable<String> generator(int count)
	{
		//итерируемый словарь, возвращаемый результат
		ArrayList<String> resultArray = new ArrayList<>();


		
		//выход из цикла
		if (count == 1)
		{
			for (String str: userarraydict)
			{


				return userarraydict;
			}
		}

		else
		{
			for (String line: userarraydict)
			{
				
				for (String lineTwo: generator(count - 1))
				{
					resultArray.add(line + lineTwo);

				}}
			return resultArray;

		}



		return resultArray;
	}
	
	
	//
	public static Iterable<Integer> range(int start, int end){
		ArrayList<Integer> intArray = new ArrayList<>();
		while(start>Integer.MIN_VALUE){
			
			if(start>end){break;}
			intArray.add(start++);
			//return intArray;
			
		}
		return intArray;	
		
	}


}
