import java.util.Scanner;

import sun.net.www.content.audio.basic;
import sun.net.www.content.text.plain;

public class DetectLoop {
    
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

    public static boolean detectLoop(Node head)
    {
        
        head.next.next=head;
        Node slow = head;
        Node fast = head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
            
        }
        return false;
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
        
       boolean res =  detectLoop(head);
       if(res == true)
       System.out.println("Loop detected");
       else
       System.out.println("Loop Not Detected");
        print(head);
    }



    
}