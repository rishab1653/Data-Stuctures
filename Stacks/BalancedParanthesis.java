import java.util.Stack;
public class BalancedParanthesis {
	
	public static boolean isParan(char ch[])
	{
	
		Stack<Character> obj = new Stack<>();
		for(int i=0 ;i<ch.length ; i++)
		{
			if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{' )
			{
				obj.push(ch[i]);
			}
			
			if(ch[i] == ')' || ch[i] == ']' || ch[i] == '}' )
			{
				if(obj.isEmpty())
					return false;
				else if(!isMatch(obj.pop() , ch[i]))
				{
					return false;
				}
			}
			
		}
		
		if(obj.isEmpty())
			return true;
		else
			return false;
	}
	
	public static boolean isMatch(char c1 , char c2)
	{
		if(c1 == '(' && c2==')')
			return true;
		else if(c1 == '{' && c2=='}')
			return true;
		else if(c1 == '[' && c2==']')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		char ch [] = {'(' , '{' , '[' , ']' , '}' , ')'  };
	
		if(isParan(ch))
		
			System.out.println("Balanced");
		
		else
			System.out.println("Not Balanced");


	}

}
