/**
 * *******************************************************************
 * Purpose/Description: Assignment2 Problem 1: implement two methods, one that
 * computes the interception between two lists, and one that computes the union.
 * Also gives the running time. Author’s Panther ID: 2056125 Certification: I
 * hereby certify that this work is my own and none of it is the work of any
 * other person.
 *******************************************************************
 */
package a2problem1;

import java.util.List;

public class A2Problem1 {

    /*
     This method has a running time complexity of minimum O(N,M) which would 
     be dependent on whichever list in the largest.
     N being the size of L1 and M being the size of L2.
     */
    public static <AnyType extends Comparable<? super AnyType>> void intersection(List<AnyType> L1, List<AnyType> L2, List<AnyType> Result) {

        if (!L1.isEmpty() && !L2.isEmpty()) {

            int pointer1 = 0;
            int pointer2 = 0;
            while (pointer1 <= L1.size() - 1 || pointer2 <= L2.size() - 1) {
                if (L1.get(pointer1).equals(L2.get(pointer2))) {
                    Result.add(L1.get(pointer1));
                    pointer1++;
                    pointer2++;
                }
                if (L1.get(pointer1).compareTo(L2.get(pointer2)) == 1) {
                    pointer1++;
                }
                if (L1.get(pointer1).compareTo(L2.get(pointer2)) == -1) {
                    pointer1 = L1.size();
                }
            }
        }

    }

    /*
     The running time complexity for this method is O(N+M) because it is 
     dependent on the size of both lists. (L1 = N, and L2 = M)
     */
    public static <AnyType extends Comparable<? super AnyType>> void union
        (List<AnyType> L1, List<AnyType> L2, List<AnyType> Result) 
    {

        if (!L1.isEmpty() && !L2.isEmpty()) 
        {
   
        

            int pointer1 = 0;
            int pointer2 = 0;
            while (pointer1 <= L1.size() - 1 && pointer2 <= L2.size() - 1) 
            {
                if (L1.get(pointer1).equals(L2.get(pointer2))) 
                {
                    Result.add(L1.get(pointer1));
                    pointer1++;
                    pointer2++;
                }
                if (L1.get(pointer1).compareTo(L2.get(pointer2)) == 1) 
                {
                    Result.add(L2.get(pointer2));
                    pointer2++;
                }
                if (L1.get(pointer1).compareTo(L2.get(pointer2)) == -1) 
                {
                    Result.add(L1.get(pointer1));
                    pointer1 = L1.size();
                }
            }
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
