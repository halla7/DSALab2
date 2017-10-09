public class LinkedList<T> implements MyList<T> {
//
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
	
	public LinkedList() {
		
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
		} else {
			tail.next = n;
		}
		tail = n;
		
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
		
		return false;
	}

	@Override
	public T get(int index) {

		return null;
	}

	@Override
	public int indexOf(T o) {

		return 0;
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
		
		return null;
	}

	@Override
	public T remove(T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean set(int index, T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public MyList subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean swap(int position1, int position2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shift(int positions) {
		// TODO Auto-generated method stub
		return false;
	}

	
		
}