import java.util.Scanner;

public class WithoutHeadPointer {

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

    public static Node deleteWithoutHead(Node var)
    {
        if(var == null)
        {
            return var;
        }
        if(var.next == null)
        {
            return var.next;
        }

        Node temp = var.next;
        var.data = var.next.data;
        var.next = var.next.next;
        return var.next;

        


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
       Node head =  takeInput();
        Node var = head;
        deleteWithoutHead(var);
        print(head);
    }
    
}



//Cases Not working :- if there is only one node and if we delete last node Only  
