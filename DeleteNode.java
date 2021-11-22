package linkedlist;

public class DeleteNode {

	public static void main(String[] args) {
		
		Node head=null;
		Node l1=new Node(1);
		Node l2=new Node(2);
		Node l3=new Node(3);
		int x=2;
		head=l1;
		l1.next=l2;
		l2.next=l3;
		Print(head);
		System.out.println();
		head=DeleteNode(head,x);
		Print(head);
		

	}
	private static Node DeleteNode(Node head, int x) {
		
		Node slow=head;
		Node fast=head.next;
		Node curr=head;
		while(fast!=null)
		{
			if(fast.data==x)
			{
				slow.next=fast.next;
			}
			slow=slow.next;
			fast=fast.next;

		}
		return curr;
		
	}
	private static void Print(Node head) {
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}

}
