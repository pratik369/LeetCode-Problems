
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1="trings";
		String input2="ingstr";
		
		
		
		String i1=input1+input1;
		String i2=input2+input2;
		if(input1.length()!=input2.length())
			System.out.println("False");
		else if(i1.contains(input2))
		{
			if(i2.contains(input1))
			{
				System.out.println("True");
			}
			else
				System.out.println("False");
		}
		else
			System.out.println("False");
	}

}
