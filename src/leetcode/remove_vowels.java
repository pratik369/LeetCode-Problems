
public class remove_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="pratik patel";
		StringBuilder str=new StringBuilder("");
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch=='u' || ch=='A'||ch=='E' || ch=='I'||ch=='O' || ch=='U')
			{
				
			}
			else
				str.append(ch);
		}
		String answer=str.toString();
		System.out.println(answer);
	}

}
