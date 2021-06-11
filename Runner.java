
public class Runner {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insertAtStart(100);
		list.insertAtStart(300);
		list.insertAt(2,1000);
		list.insertAt(4, 500);
		list.delete(1);
		list.deleteAtLast();
		list.show();

	}

}
