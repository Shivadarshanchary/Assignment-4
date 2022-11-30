
public class CountVowelsConsSpecialCharcters {

	public static void main(String[] args) {
		String s1="iNeuron@@##Banglore";
		s1=s1.toLowerCase();
		int vowelCount=0;
		int consCount=0;
		int spclCount=0;
		for(int i=0;i<s1.length();i++) 
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				vowelCount=vowelCount+1;
			}
			else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				consCount=consCount+1;
			}
			else 
				spclCount=spclCount+1;
				
		}
		System.out.println("No of vowels in string are : " +vowelCount);
		System.out.println("No of consonants in string are : " +consCount);
		System.out.println("No of special characters are : " +spclCount);
	}

}
