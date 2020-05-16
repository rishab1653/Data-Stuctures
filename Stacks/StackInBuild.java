import java.util.Stack;

public class StackInBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> obj = new Stack<>();
		int arr[] = {1 , 2 , 3 , 4};
		for(int i=0 ;i<arr.length ; i++)
		{
			obj.push(arr[i]);
			
		}
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.peek());
		while(!obj.isEmpty())
		{
			System.out.println("Popped ELemenr is " +obj.pop());
		}
		

	}

}
