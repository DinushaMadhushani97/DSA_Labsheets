package LinkList;

public class LinkListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList studentList = new LinkList();
		
		//insert links into the link list
		studentList.insertFirst("Parshani", 69.5);
		studentList.insertFirst("Aravinda", 78.0);
		studentList.insertFirst("Nipuna", 53.5);
		
		//display the link List
		studentList.displayList();
		
		//delete links from the link list 
		studentList.deleteLink("Aravinda");
		
		System.out.println();
		System.out.println("------Deleted------");
		System.out.println();
		
		studentList.displayList();

	}

}
