import java.util.Scanner;



public class Merge {
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

    public static Node mergeSorted(Node headA , Node headB)
    {
        Node newNode = new Node(0);
        Node tail = newNode;

        while(true)
        {
            if(headA == null)
            {
                tail.next = headB;
                break;
            }

            if(headB == null)
            {
                tail.next = headA;
                break;
            }
            
            if(headA.data < headB.data)
            {
                tail.next = headA;
                headA = headA.next;
            }

            else
            {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return newNode;
        //agar 0 na aye toh newNode.next return kardo

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

        Node headA = takeInput();
        Node headB = takeInput();
        Node head =  mergeSorted(headA, headB);
        print(head);

    }
}

