
public class QueueAsArray {

	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueAsArray()
	{
		data = new int[10];
		front =-1;
		rear=-1;
		size=0;
		
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return (size==0);
	}
	
	public int front() throws QueueEmptyException
	{
		if(size == 0)
			throw new QueueEmptyException();
		return data[front];
	}
	
	public void enqueue(int element) throws QueueFullException
	{
		if(size == data.length)
			throw new QueueFullException();
		if(size == 0)
		{
			front=0;
		}
		size++;
		rear++;
		if(rear == data.length)
		{
			rear = 0;
		}
		data[rear]=element;
	}
	
	public int dequeue() throws QueueEmptyException
	{
		if(size == 0)
			throw new QueueEmptyException();
		
		int temp = data[front];
		front++;
		if(front == data.length)
		{
			front =0;
		}
		size--;
		return temp;
		
	}
	
}
