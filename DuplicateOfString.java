import java.util.Scanner;

public class DuplicateOfString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		String s2=s1.toLowerCase();
		
		System.out.println("String is :"+s1);
		
		
	
		
		System.out.println("Duplicates are: ");

		
		for(int i=0;i<s2.length();i++) 
		{
			for (int j=i+1;j<s2.length();j++)
			{
				if(s2.charAt(i)==s2.charAt(j))
					System.out.print(s2.charAt(j)+" ");
				
					
					
			}
		}

	}

}
