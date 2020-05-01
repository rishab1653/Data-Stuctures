import java.util.Scanner;



public class IsCircular {

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

    public static boolean isCircular(Node head)
    {
        if(head == null)
        {
            return true;
        }

        Node temp = head.next;

        if(temp!=null && temp==head)
        temp=temp.next;
        return(temp==head);

    }


    public static void print(Node head)

    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head=head.next;
        }

    }


    public static void main(String[] args)
    {
        Node head = takeInput();
        boolean flag = isCircular(head);
        print(head);
        System.out.println("---------------------------------------------------------------");
        if(flag ==  true)
        System.out.println("The Given Linked List Is Circular");
        else
        System.out.println("The Given Linked List Is Not Circular");



    }
    
}