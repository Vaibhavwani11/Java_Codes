import java.util.HashMap;

class NoOfOccurenceOfCharacters {

	static void getOccurance(String str){

		HashMap<Character,Integer> m=new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (m.containsKey(str.charAt(i))) {

			   int count = m.get(str.charAt(i));
			   m.put(str.charAt(i), ++count);
			
			} else {
			   m.put(str.charAt(i),1);
			}
		 }
		 System.out.println(m);
	}
	public static void main(String[] args)
	{
		String str = "Jaavva";
		getOccurance(str);
	}
}
