import java.util.Scanner;

public class MiddleElement {
    
    public static Node takeInput()
    {
        Node head = null;
        Scanner q = new Scanner(System.in);
        int data = q.nextInt();
        while(data != -1)
        {
            Node newNode = new Node(data);

            if(head == null)
            {
                head = newNode;
            }
            else
            {
                Node temp = head;
                while(temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = newNode;

            }
            data = q.nextInt();

        }
        return head;
    }
    public static Node takeInputTail()
    {
        Node head = null;
        Node tail = null;
        Scanner sc1 = new Scanner(System.in);
        int data = sc1.nextInt();
        while(data != -1)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
              
                tail.next = newNode;
                tail = tail.next;   
            } 
            data = sc1.nextInt();
        }
        return head;
    }
    public static void print(Node head)

    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head=head.next;
        }

    }

    public static Node findMiddle(Node head)
    {
        Node slow = head;
        Node fast = head;
    
        while(fast.next!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args)
    {
        Node head = takeInputTail();
        Node head1 = findMiddle(head);
        System.out.println(head1.data);

    }

}