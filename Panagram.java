
public class Panagram {

	public static void main(String[] args) {
		boolean flag=false;
		String s1="Pack my box with five dozen liquor jugs";
		s1=s1.toUpperCase();
		s1=s1.replace(" ","" );
		
		char[] c=s1.toCharArray();
		int[] a=new int[26];
		for(int i=0;i<c.length;i++) {
			int indx=c[i]-65;
			a[indx]++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.println("not a panagram");
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("it is a panagram");
		}

	}

}
