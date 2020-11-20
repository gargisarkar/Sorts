import javax.swing.*;

public class LinkedList {
    Node head;

    public void add(int val){

      Node incoming = new Node(val);
      Node temp = head;

      if(temp == null){
          head = incoming;
      }
      else if(temp.next == null){
          temp.next = incoming;
      }
      else{
          while(temp.next != null){
              temp = temp.next;
          }
          temp.next= incoming;
      }

    }

    public void midElement(LinkedList inputList) {
        Node temp = head;
        Node mid = head;
        int count = 0 ;
        if (head == null)
            System.out.println("list is empty");
        else if (temp.next == null)
            System.out.println(temp.val);
        else {
            while(temp.next != null){
                temp = temp.next;
                count++;
                if(count %2 == 0){
                    mid = mid.next;
                }
            }
            System.out.println(mid.val);
        }
    }

    public void printList(LinkedList l){
        Node temp = head;
        if(l.head == null)
            System.out.println("Empty List");
        else{
            while(temp.next!= null){
                System.out.println(temp.val);
                temp = temp.next;
            }
            System.out.println(temp.val);
        }
    }

    public void deleteDuplicates(LinkedList ll) {
        Node temp = head;

        if (head == null)
            System.out.println("Empty List");

        else if (temp.next == null)
            System.out.println("No duplicates");

        else {
            while (temp.next != null) {
                if (temp.next.val == temp.val) {
                    temp.next = temp.next.next;
                } else
                    temp = temp.next;
            }

        }
    }

    public void deleteZero(LinkedList ll){
        Node temp = head ;
        int flag = 0;
        if( head == null)
        {
            System.out.println("empty list");
        }
        else if(temp.next == null & temp.val == 0){
            head = null;
        }
        else{
            if(head.val == 0)
            {
                head = head.next;
                temp = head;
            }
            while (temp.next != null) {
                   if (temp.next.val == 0) {
                        while (temp.next.val == 0) {
                            if (temp.next.next != null)
                                temp.next = temp.next.next;
                            else {
                                temp.next = null;
                                flag = 1;
                                break;
                            }
                            if (flag == 1)
                                break;
                        }
                    }
                  else
                        temp = temp.next;
                }
            }
        }



}
