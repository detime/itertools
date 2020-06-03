public class Main extends Itertools
{
	public static void main(String[] args){
		
		String dict = "";
		for(int i: range(97, 122)){
			dict += (char)i;
		}
		
		for(String s:product(dict,2)){
			System.out.println(s);
		}
		
	}
}
