package linkedlist;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		
		Node head1=null;
		head1=Insert(head1,1);
		head1=Insert(head1,2);
		head1=Insert(head1,4);
//		head1=Insert(head1,7);
		
		
		Print(head1);
		System.out.println();
		Node head2=null;
		head2=Insert(head2,1);
		head2=Insert(head2,3);
		head2=Insert(head2,4);
//		head2=Insert(head2,8);
		
		Print(head2);

		System.out.println();
		Node mergedLinkedList=Merge(head1,head2);
		
		Print(mergedLinkedList);
	}

	private static Node Merge(Node head1, Node head2) {
		
		Node dummy=new Node(0);
		Node tail=dummy;
		while(head1!=null || head2!=null)
		{
			if(head1==null)
			{
				tail.next=head2;
				break;
			}
			if(head2==null)
			{
				tail.next=head1;
			}
			if(head1.data<=head2.data)
			{
				tail.next=head1;
				head1=head1.next;
			}
			else {
				tail.next=head2;
				head2=head2.next;
			}
			tail=tail.next;
		}
		return dummy.next;
	}

	private static void Print(Node head) {
		
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}

	private static Node Insert(Node head, int i) {
		
		Node newNode=new Node(i);
		if(head==null)
		{
			return newNode;
		}
		
		Node pntr=head;
		while(pntr.next!=null)
		{
			pntr=pntr.next;
		}
		pntr.next=newNode;
		pntr=head;
		return head;
		
		
	}

}
