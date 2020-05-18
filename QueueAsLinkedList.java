
public class QueueAsLinkedList {
	private Node front;
	private Node rear;
	private int size;
	
	public QueueAsLinkedList()
	{
		front = rear =null;
		size=0;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size == 0);
	}
	
	public int front() throws QueueEmptyException
	{
		if(size == 0)
			throw new QueueEmptyException();
		return front.data;
	}
	
	
	public void enqueue(int element)
	{
		Node newNode = new Node(element);
		
		if(size == 0)
		{
			front = newNode;
			rear = newNode;
		}
		else
		{
		rear.next = newNode;
		rear = rear.next;
		}
		
		size++;
	}
	
	public int dequeue() throws QueueEmptyException
	{
		if(!isEmpty())
		{
		int temp = front.data;
		front = front.next;
		size--;
		return temp;
		}
		
		else
			throw new QueueEmptyException();
	}
	
	
	public static void main(String[] args) throws QueueEmptyException
	{
		QueueAsLinkedList obj = new QueueAsLinkedList();
		for(int i=1;i<=10;i++)
		{
			obj.enqueue(i);
		}
		
		while(!obj.isEmpty())
		{
			System.out.println(obj.dequeue());
		}
	}

}
