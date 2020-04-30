import java.util.Scanner;

public class Reverse {

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

    public static Node reverseList(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;

    }
    
    public static Node reverseRecursion(Node head)
    {
        if(head == null)
        {
            return head;
        }

        else if(head.next == null)
        {
            return head; 
        }
        Node newNode = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }
     public static void main(String[] args)
    {
        Node head = takeInputTail();
        Node head1 = reverseList(head);
        print(head1);
        Node head2 = reverseRecursion(head);
        print(head2);
        
        
        

    }

}