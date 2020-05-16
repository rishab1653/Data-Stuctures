
public class StackUsingLinkedList {
	
	private static final Exception StackEmptyException = null;
	private Node head ;
	private int size ;
	
	public StackUsingLinkedList()
	{
		head = null;
		size =0;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size()==0) ;
		//return (head == null);
	}
	
	public int topOfStack() throws Exception
	{
		if(size() == 0)
		{
			throw StackEmptyException;
		}
		int temp = head.data;
		return temp;
	}
	
	public void push(int element)
	{
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public int pop() throws Exception
	{
		if(size() == 0)
		{
			throw StackEmptyException ;
		}
		
		int tempdata = head.data;
		head = head.next;
		size -- ;
		return tempdata;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingLinkedList obj = new StackUsingLinkedList();
		for (int i=1 ;i<=5 ;i++)
		{
			obj.push(i);
		}
		
		int s = obj.size();
		System.out.println("The Size OF StackLinkexList Is " +s);
		
		while(!obj.isEmpty())
		{
			System.out.println("popped from stackLinkedlIst is  " +obj.pop());
		}
		
		boolean flag = obj.isEmpty();
		System.out.println(flag);
		
		

	}

}
