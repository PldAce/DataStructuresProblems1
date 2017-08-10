/*********************************************************************
 Purpose/Description: Assignment 2 Problem 3: A class that implements a 
 * MyList Data Structure that takes O(1) time per operation.
 Author’s Panther ID: 2056125
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 ********************************************************************/ 
package a2problem3;


public class MyList <AnyType> {

    private Node head;
    private Node last;
    
    MyList()
    {
       head = null;
       last = null;
       
    }
    public String toString()
    {
        
        if (head == null)
        {
            return "";
        }
        else
        {
            String r = "";
            Node current = head;

             while (current.next != null){
                r += current.data + " , ";
                current = current.next;
            }
             r += current.data;
             return r;
        }
        
    }
    
    void myPush(AnyType x)
    {
        Node temp = new Node();
        
        if (head == null)
        {
          temp.data = x;
          head = temp;
          last = head;
        }
        else 
        {
            temp.data = x;
            head.previous = temp;
            temp.next = head;
            head = temp;
        }

    }
 
    AnyType myPop() 
    {
         Node temp = new Node();
         temp.data = head.data;
         if (head.next != null)
         {
            head = head.next;
            head.previous = null;
         }
         else if (head == null)
                 {
                     head = null;
                     last = null;
                 }
         else 
         {
             head = null;
             
         }
         

         return (AnyType)temp.getData();
    }
    
     void myInject(AnyType x) 
     {
           Node temp = new Node();
           temp.data = x;
           temp.previous = last;
           last.next = temp;
           last = temp;          
           
     }
     AnyType myEject() 
     {
         Node temp = new Node();
         if(head != null)
         {
         temp.data = last.data;
         last = last.previous;
         last.next = null;
         }
         else 
         {
             head = null;
             last = null;
         }
         return (AnyType) temp.data;
         
     } 
 
    public class Node<AnyType> 
    {

        Node next = null;

        Node previous = null;
        
        AnyType data;


        public AnyType getData()
        {
            return data;
        }


    }

//    public static void main(String[] args) {
//        // My Tester
//        
//        MyList yes = new MyList();
//        
//        yes.myPush(0);
//        System.out.println(yes);
//        yes.myPush(5);
//                System.out.println(yes);
//
//        yes.myPush(8);
//                System.out.println(yes);
//
//        yes.myInject(10);
//                System.out.println(yes);
//
//        yes.myPop();
//                System.out.println(yes);
//
//        yes.myEject();
//                System.out.println(yes);
//
//        
//        
//    }
    
}
