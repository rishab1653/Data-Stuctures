
public class StackUsingArray {
	private int data [] ;
	private int top;
	
	public StackUsingArray()
	{
		data = new int[10];
		top = -1;
	}
	
	public StackUsingArray(int n)
	{
		data = new int[n];
		top = -1;
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public int size()
	{
		return top+1;
	}
	
	public int topOfStack() 
	{
		if(top<0)
			System.out.println("UnderFlow No element exist");
		return data[top];
	}
	
	
	public void push(int element)
	{
		if(top == data.length-1)
//			System.out.println("OverFLow");
			
			doubleCapacity();
		
		top = top+1;
		data[top]=element;
	}
	private void doubleCapacity()
	{
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i=0;i<=top;i++)
		{
			data[i]=temp[i];
		}
	}
	
	public int pop()
	{
		if(top == -1)
			System.out.println("No Elemrnt exist");
		int temp = data[top];
		top=top-1;
		return temp;
	}
	
	public static void main(String[] args)
	{
		StackUsingArray obj = new StackUsingArray(3);
//		obj.push(10);
//		obj.push(20);
//		obj.push(30);
//		obj.push(40);
//		obj.push(50);
//		obj.push(60);
		
		for(int i=1 ; i <=5;i++)
		{
			obj.push(i);
		}
		
		boolean flag = obj.isEmpty();
		System.out.println(flag);
		
		int result = obj.size();
		System.out.println("The size of stack is " +result);
		
		int top = obj.topOfStack();
		System.out.println("The top of stack is  "  +top);
		
		
		while(!obj.isEmpty())
		{
			System.out.println("Popp elememt is " +obj.pop());
		}
		
		

	}
	

}
