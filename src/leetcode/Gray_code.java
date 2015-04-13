
public class Gray_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=5;
		int n2=13;
		int x=n1^n2;
		// method 1
		if(x==0)
			System.out.println("False");
		else if((x&(x-1))==0)
			System.out.println("True");
		else
			System.out.println("False");
		
		// method 2  (counting 1s)
		
		x=n1^n2;
		int count=0;
		while(x!=0)
		{
			int bit=x%2;
			if(bit==1)
			count++;
			x=x/2;
		}
		if(count==1)
		{
			System.out.println("True 2 ");
		}
		else
			System.out.println("False");

        
	}
    public static boolean graycheck(int one, int two){
        int differences = 0;
        while (one > 0 || two > 0){
            // Checking if the rightmost bit is same
            if ((one & 1) != (two & 1)){
                differences++;
            }
            one >>= 1;
            two >>= 1;
        }
        return differences == 1;
    }

}
