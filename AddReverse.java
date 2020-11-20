/*https://leetcode.com/problems/add-two-numbers/*/

public class AddReverse {
  static LinkedList fin2 = new LinkedList();
    public static void main(String[] args){
        LinkedList L1 = new LinkedList();
        LinkedList L2 = new LinkedList();
        L1.add(9);
        L1.add(9);
        L1.add(9);
        L1.add(9);
        L1.add(9);
        L1.add(9);
        L1.add(9);

        L2.add(9);
        L2.add(9);
        L2.add(9);
        L2.add(9);

//        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//        Output: [8,9,9,9,0,0,0,1]

        AddReverse x = new AddReverse();
        LinkedList res= x.addLL(L1,L2);

        res.printList(res);
    }



    public LinkedList addLL(LinkedList L1 , LinkedList L2){
        Node temp1 = L1.head;
        Node temp2 = L2.head;
        int carry = 0;
         while(temp1.next != null && temp2.next != null){
             int val1 = temp1.val;
             int val2 = temp2.val;
             int res = val1 + val2 + carry;
             if(res< 10) {
                 fin2.add(res);
             }
             else{
                 fin2.add(res%10);
                 carry = res/10;
             }
             temp1 = temp1.next;
             temp2 = temp2.next;

         }

        if (temp1.next == null && temp2.next != null) {
            while(temp2.next != null){
                int res = temp2.val+temp1.val +carry;
                if(res < 10)
                  fin2.add(res);

                else{
                    fin2.add(res%10);
                    carry = res/10;
                }
                temp1.val = 0;
                temp2 = temp2.next;
            }
            fin2.add(temp2.val+carry);
            return  fin2;

        }

        else if(temp2.next == null && temp1.next != null){

            while(temp1.next != null){
                int res = temp1.val + temp2.val +carry;
                if(res < 10)
                    fin2.add(res);

                else{
                    fin2.add(res%10);
                    carry = res/10;
                }

                temp2.val = 0;
                temp1 = temp1.next;
            }
            fin2.add(temp1.val+carry);
          return fin2;
        }

          else {
             fin2.add(temp1.val + temp2.val + carry);
              return fin2;
          }
    }
}


