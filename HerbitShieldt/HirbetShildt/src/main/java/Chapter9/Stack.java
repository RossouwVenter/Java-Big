/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author rosso
 */
public class Stack {
   private char stck[]; // this array holds the stack   
  private int tos;  // top of stack   
    
  // Construct an empty Stack given its size.   
  Stack(int size) {    
    stck = new char[size]; // allocate memory for stack   
    tos = 0;    
  }    
   
  // Construct a Stack from a Stack.   
  Stack(Stack ob) {   
    tos = ob.tos;   
    stck = new char[ob.stck.length];   
   
    // copy elements   
    for(int i=0; i < tos; i++)   
      stck[i] = ob.stck[i];   
  }   
   
  // Construct a stack with initial values.   
  Stack(char a[]) {   
    stck = new char[a.length];   
   
    for(int i = 0; i < a.length; i++) {   
      try {  
        push(a[i]);   
      }   
      catch(StackFullException exc) {  
        System.out.println(exc);  
      }  
    }       
  }   
      
  // Push characters onto the stack.   
  void push(char ch) throws StackFullException {    
    if(tos==stck.length)  
      throw new StackFullException(stck.length);  
 
    stck[tos] = ch;   
    tos++;   
  }    
    
  // Pop a character from the stack.   
  char pop() throws StackEmptyException {    
    if(tos==0)    
      throw new StackEmptyException();  
      
    tos--;    
    return stck[tos];    
  } 
}
