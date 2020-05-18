
public class QueueUse {

	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		QueueAsArray obj = new QueueAsArray();
		System.out.println("Size" +obj.size());
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		obj.enqueue(5);
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		
//		for (int i=1 ; i<=5 ; i++)
//		{
//		try
//			{
//			obj.enqueue(i);
//			}
//		catch (QueueFullException e) 
//			{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			}	
//		}
//		
//		while(!obj.isEmpty())
//		{
//			try {
//				System.out.println(obj.dequeue());
//			} catch (QueueEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
