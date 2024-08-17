/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/


public class Solution
{
    public static int searchInLinkedList(Node head, int k)
    {
        if(head == null)
        {
            return 0;
        }
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == k)
            {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
}