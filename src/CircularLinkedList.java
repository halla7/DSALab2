public class CircularLinkedList<T> implements MyList<T>{
	
	private class Node<T> {
		public T data;
		public Node<T> next;
		
		public Node(T o) {
			this.data = o;
			this.next = null;
		}
	}
	private int size;
	private Node<T> head;	
	private Node<T> tail;
	
	public CircularLinkedList() {
		
	}
	
	@Override
	public boolean add(int index, T t) {
		if (index < 1 || index < size) {
			throw new
			IndexOutOfBoundsException(index + " < 0 or >= " + size);
		} else if (index == size) {
			add(t);
		} else if (index == 0) {
			Node<T> n = new Node<T>(t);
			head = n;
			size++;
		} else {
			Node<T> prev = head;
			for (int i = 0; i < index - 1; i++) {
				prev = prev.next;
			}
			
			Node<T> after = prev.next;
			Node<T> n = new Node<T>(t);
			
			prev.next = n;
			
			size++;
			
		}
		
		
	
		return false;
	}

	@Override
	public boolean add(T o) {
		Node n = new Node(o);
		
		if(size == 0) {
			head = n;
			tail = n;
			tail.next =n;
		} else {
			Node<T> after=tail.next;
			tail = n;
			tail.next=after;
		}
		
		size++;
		return true;
	}

	@Override
	public boolean clear() {
		head = null;
		tail = null;
		size = 0;
		return false;
	}

	@Override
	public boolean contains(T o) {
		boolean flag = false;
		Node<T> current=head;
		Node<T> nextone=head.next;
		
		do {
			if (current.equals(o))
				return true;
			else {
				current=nextone;
				nextone=current.next;
			}
		} while (current!=head);
		return flag;
	}

	@Override
	public T get(int index) {
		Node<T> current=head;
		Node<T> nextone=head.next;
		for (int i=0; i<index; i++) {
			current=nextone;
			nextone=current.next;
		}
		return null;  //how can I return T for current instead of null?
	}

	@Override
	public int indexOf(T o) {
		int mCount = 0;
		Node<T> current=head;
		Node<T> nextone=head.next;
		
		do {
			if (current.equals(o))
				return mCount;
			else {
				current=nextone;
				nextone=current.next;
				mCount+=1;
			}
		} while (current!=head);
		return -1;
	}

	@Override
	public boolean isEmpty() {
		boolean flag = false;
		if (size == 0) {
			flag = true;;
		} else {
			return flag;
		}
		return flag;
	}

	@Override
	public T remove(int index) {
		Node<T> prevone=null;
		Node<T> current=head;
		Node<T> nextone=head.next;
		for (int i=0; i<index; i++) {
			prevone=current;
			current=nextone;
			nextone=current.next;
		}
		if (prevone!=null)
			prevone.next=current.next;
		return null;  //how can I return T for current instead of null?
	}

	@Override
	public T remove(T o) {
		Node<T> prevone=tail;
		Node<T> current=head;
		Node<T> nextone=head.next;
		do {
			if (current.equals(o))
				prevone.next=current.next;
			else {
				prevone=current;
				current=nextone;
				nextone=current.next;
			}
		} while (current!=head);
		return null;  //how can I return T for current instead of null?
	}

	@Override
	public boolean set(int index, T element) {
		Node<T> myItem= new Node<T>(element);
		Node<T> prevone=null;
		Node<T> current=head;
		Node<T> nextone=head.next;
		for (int i=0; i<index; i++) {
			prevone=current;
			current=nextone;
			nextone=current.next;
		}
		if (prevone!=null) {
			prevone.next=myItem;
			myItem.next=current;
			return true;
		}
		
		return false;
	}

	@Override
	public int size() {
		size=0;
		Node<T> current=head;
		while (current.next!=head) {
			current=current.next;
			size+=1;
			}
		return size;
	}

	@Override
	public MyList subList(int fromIndex, int toIndex) {
		ArrayList myList = new ArrayList();
		Node<T> current=head;
		if (size()<toIndex-fromIndex)
			return null;
		for (int i=0; i<fromIndex; i++) {
			current=current.next;
		}
		for (int i=fromIndex; i<toIndex; i++) {
			myList.add(current);
			current=current.next;
		}
		return myList;
	}

	@Override
	public T[] toArray() {
		ArrayList myList = new ArrayList();
		Node<T> current=head;
		while (current.next!=head) {
			myList.add(current);
			current=current.next;
			}
		return null;  //how can I return T[] for myList instead of null?
	}

	@Override
	public boolean swap(int position1, int position2) {
		Node<T> prev1=head;
		Node<T> prev2=head.next;
		Node<T> swap1=head;
		Node<T> swap2=head.next;
		for (int i=0; i<position1; i++) {
			prev1=swap1;
			swap1=swap1.next;
		}
		for (int i=0; i<position2; i++) {
			prev2=swap2;
			swap2=swap2.next;
		}
		prev1.next=swap2;
		prev2.next=swap1;
		swap1.next=swap2.next;
		swap2.next=swap1.next;
		return false;
	}

	@Override
	public boolean shift(int positions) {
		ArrayList myList = new ArrayList();
		Node<T> current=head;
		if (size()<positions || positions<0)
			return false;
		for (int i=0; i<positions; i++) {
			myList.add(current);
			current=current.next;
		}
	/*
		for (int i=0; i<positions; i++) {
			current=myList[i];
			current.next=myList[i+1];
			myList[i]=myList[i+1];
		}
	*/
		return false;
	}

}