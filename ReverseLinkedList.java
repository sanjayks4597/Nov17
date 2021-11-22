package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head=null;
		Node l1=new Node(1);
		Node l2=new Node(2);
		Node l3=new Node(3);
		
		head=l1;
		l1.next=l2;
		l2.next=l3;
		Print(head);
		System.out.println();
		head=ReverseTheList(head);
		Print(head);
	}

	private static void Print(Node head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}

	private static Node ReverseTheList(Node head) {
	
		Node pre=null;
		Node curr=head;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}
		return pre;
	}

}
