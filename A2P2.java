/*********************************************************************
 Purpose/Description: Assignment 2 Problem 2: Sort a Stack with an auxiliary 
 * stack
 Author’s Panther ID: 2056125
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 ********************************************************************/ 
package a2p2;

import java.util.Stack;


public class A2P2 {

    /*
    The running time complexity would be O(N^2) because you would iterate 
    through the stack twice ( N*N) = O(N^2).
    */
    static Stack<Integer> sort(Stack<Integer> s) 
    {
        Stack <Integer> sortStack = new Stack<>();
        
        while (!s.isEmpty())
        {
            int number2Sort = s.pop();
             while (sortStack.peek() < number2Sort && !sortStack.isEmpty()) 
                {
                    s.push(sortStack.pop());
                }            
                sortStack.push(number2Sort);
        }
        
        return sortStack;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
