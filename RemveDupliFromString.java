
public class RemveDupliFromString {

	public static void main(String[] args) {
		
		
        String s1 =  "laptop";
        StringBuffer sb=new StringBuffer();
        System.out.println("given String :"+s1);
        System.out.println();
        
        System.out.println("After removing duplicate values from given String :");
        for (int i = 0; i < s1.length(); i++) 
        {
        	char ch=s1.charAt(i);
        	int index=s1.indexOf(ch,i+1);
        	if(index==-1)
        		sb.append(ch);
        }

       System.out.print(sb);

    
		
		
	}

}
