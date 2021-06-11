

public class LinkedList {
	Node head;
	
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.Prev=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
			node.Prev=n;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.Prev=null;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
		node.next=head;
		head.Prev=node;
		head=node;
		}
		
	}
	public void insertAt(int index,int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(index==0)
		{
			insertAtStart(data);
			
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next.Prev=node;
			node.Prev=n.next;
			n.next=node;
		}


}
	public void delete(int index)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		if(index==0)
		{
			if(head.next!=null)                //if there are 2 more nodes
			{
				head=head.next;
			}
			else                                 //if there is only one node
			{
				head=null;
			}
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n.next=n.next.next;
			n.next.Prev=n;
		}
		
	}
	void deleteAtLast()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		if(head.next == null)
		{
			head = null;
		}
		else
		{
			Node n= head;
			while(n.next.next != null)
			{
				n= n.next;
			}
			n.next = null;
		}
	}
	
	public void show()
	{
		Node node=head;                                  
		while(node.next!=null)                          
		{
			System.out.print(node.data + " ");
			node=node.next;                            
		}
		System.out.print(node.data + " ");
	}
			
	
}
	

