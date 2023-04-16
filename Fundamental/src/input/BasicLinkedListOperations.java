package input;


import exception.CustomException;
import node.ListNode;

public class BasicLinkedListOperations {

	private ListNode headNode;
	BasicLinkedListOperations(){
		this.headNode=null;
	}
	
	public static void main(String[] args) {
	
		//insertion at beginning
		BasicLinkedListOperations basicLinkedListOperations= new BasicLinkedListOperations();
		int i=6;
		while(--i>0) {
			displayListNode(basicLinkedListOperations.insertionAtBegining(i));
		}
		
		System.out.println("insertion at end");
		
		//insertion at end
		displayListNode(basicLinkedListOperations.insertionAtEnd(30));
		displayListNode(basicLinkedListOperations.insertionAtEnd(50));
		
		System.out.println("insertion at middle");
		//insertion at middle
		
		try {
			displayListNode(basicLinkedListOperations.insertionAtMiddle(90,6));
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//deletion at beginning
		
		//deletion at end
		
		//deletion at middle

	}
	
	private synchronized ListNode insertionAtEnd(int data) {
	
		if(headNode==null) {
			headNode= new ListNode(data);
		}
		else {
			ListNode currentNode=headNode;
			while(currentNode.getNext()!=null) {
				currentNode=currentNode.getNext();	
			}
			currentNode.setNext(new ListNode(data));
		}
		return headNode;
	}
	
	private synchronized  ListNode insertionAtMiddle(int data,int pos) throws CustomException {
		int count=0;
		int len=listLength(headNode);
		if(headNode==null) {
			headNode= new ListNode(data);
		}
		else if(pos<=len-1) {
			ListNode currentNode=headNode;
			ListNode nextNode=null;
			while(currentNode.getNext()!=null) {
				
				if(count==pos-1) {
					
					nextNode=currentNode.getNext();
					currentNode.setNext(new ListNode(data));
					currentNode.getNext().setNext(nextNode);
					
				}
				currentNode=currentNode.getNext();	
				count++;
			}
			
		}
		else {
			throw new CustomException("Invalid position");
		}
		return headNode;
	}

	public static void displayListNode(ListNode headNode) {
		if(headNode==null) {
			System.out.println("empty list");
		}
		while(headNode!=null) {
			System.out.print(headNode.getData()+ " ");
			headNode= headNode.getNext();
		}
		System.out.println();
	}
	

	public static int listLength(ListNode headNode) {
		//Time complexity : O(n) , Space Complexity : O(1) for creating temporary variable
		int length=0;
		ListNode currentNode= headNode;
		while(currentNode!=null) {
			length++;
			currentNode=currentNode.getNext();
		}
		return length;
	}
	
	public synchronized ListNode insertionAtBegining(int data ) {
		
		if(headNode==null) {
			headNode= new ListNode(data);
		}
		else {
			ListNode currentNode=new ListNode(data);
			currentNode.setNext(headNode);
			headNode=currentNode;
		}
		
		return headNode;
		
	}

}
