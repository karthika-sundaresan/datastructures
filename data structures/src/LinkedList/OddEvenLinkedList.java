package LinkedList;

import models.Node;

public class OddEvenLinkedList {
	
	    public Node oddEvenList(Node head) {
	        
	        if(head !=null){
	            
	            Node oddTail = head;
	            
	            if(head.next ==null){
	                return head;
	            }
	            Node evenHead = head.next;
	            Node evenTail = head.next;
	            
	            Node curr = evenHead.next;
	            
	            int count = 2;
	            
	            while(curr != null) {
	                
	                count += 1;
	                
	                if(count%2 ==1) {
	                    oddTail.next = curr;
	                    oddTail = curr;
	                }else{
	                    evenTail.next=curr;
	                    evenTail=curr;       
	                }
	                curr=curr.next;
	            }
	            
	            oddTail.next = evenHead;
	            evenTail.next = null;
	        }
	        
	        return head;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
