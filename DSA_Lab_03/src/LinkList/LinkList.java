package LinkList;

public class LinkList {
	
	private Link first;
	
    //parameterized constructor
	public LinkList(){
	
		first = null;
	}
	
	//iseMPTY METHOD IMPLEMENTATION
	public boolean isEmpty() {
		return (first == null);
		
	}
	
	//insirtFirst method implementation
	public void insertFirst(String name, double avg) {
		
		Link newLink = new Link(name, avg);//new link creation
		newLink.next = first; //new link
		first = newLink;//current first
	}
	
	//delete first method implementation
	
	public Link deletFirst() {
		
		Link temp = first;//save the reference of first to temp
		first = first.next;//change the first reference to next available link
		return temp;//returning temp reference
		
	}
	//display details method implementation
	
	public void displayList() {
		
		Link current = first;//in order to start from the beginning
		while(current !=null) {
			
			current.displayDetails();//display link
			current = current.next;//moving to the next Link
		}
	}
	
	//delete a particular link or a given link from the link list
	
	public Link deleteLink(String name) {
		
		Link current = first;
		Link previous = first;
		
		if(current == null) {
			
			return null;//if the list empty
		}
		while(!current.name.equals(name)) {
			
			previous = current;
			current = current.next;
			
			if(current == null) {
				return null;//if the link list does not have element to be deleted
				
			}
		}
			if(current == first) {
				
				first = first.next;
			}else {
				
				previous.next = current.next;
				
			}
			return current;
		}
	

}
