package LinkList;

public class LinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation - Link Implementation
		
		Link Nipuna = new Link("Nipuna", 53.5);
		Link Aravinda = new Link("Aravinda", 78.0);
		Link Prashani = new Link("Prashani", 69.5);
		
		//link list implementation
		Nipuna.next = Aravinda;
		Aravinda.next = Prashani;
		Prashani.next = null;
		
		//display details
		Nipuna.displayDetails();//nipuna's Link
		Nipuna.next.displayDetails();//Aravinda's Link
		Nipuna.next.next.displayDetails();//Prashani's Link
		
	}

}
