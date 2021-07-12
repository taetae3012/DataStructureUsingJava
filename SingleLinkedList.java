package ds;


 class SingleLinkedList {
   private static  ListNode head;
   
   private static  class ListNode{
	   private int data;
	   private ListNode next;
   
   public ListNode(int data) {
	   this.data=data;
	   this.next=null;
   }	
   }
   
   public void display() {
	   ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" ->");
			current=current.next;
		}
		System.out.println("null");
   }
   
   public void insertAtBeginning(int value) {
	   ListNode newnode=new ListNode(value);
	   newnode.next=head;
	   head=newnode;
   }
   
   public void insertAtEnd(int value) {
	   ListNode newnode=new ListNode(value);
	 
	   if(head==null) {
		   head=newnode;
		   return;
		   
	   }
	   ListNode current=head;
	   while(null!=current.next) {
		   current=current.next;
	   }
	   current.next=newnode;
	  
   }
   
   public void insertAtPosition(int value,int index) {
	   ListNode newnode=new ListNode(value);
	   if(index==1) {
		   newnode.next=head;
		   head=newnode;
	   }
	   else {
		   ListNode previous=head;
		   int count=1;
		   while(count<index-1) {
			   previous=previous.next;
			   count++;
		   }
		   ListNode current=previous.next;
		   newnode.next=current;
		   previous.next=newnode;
	   }
   }
   
   public static void main(String[] args) {
	   
	/*SingleLinkedList s1=new SingleLinkedList();
	s1.head=new ListNode(1);             //head  ->1 ->null
	ListNode second =new ListNode(19);   //        1 ->19
	ListNode third =new ListNode(8);     //        1 ->19 ->8
	ListNode fourth =new ListNode(7);    //        1 ->19 ->8 ->7
	s1.head.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=null;
	s1.display();
	
	SingleLinkedList s2=new SingleLinkedList();
	s2.insertAtBeginning(34);
	s2.insertAtBeginning(4);
	s2.insertAtBeginning(78);
	s2.display();*/
	SingleLinkedList s3=new SingleLinkedList();
	s3.insertAtEnd(34);
	s3.insertAtEnd(4);
	s3.insertAtEnd(78);
	s3.insertAtPosition(9, 2);
	s3.display();
}
}
