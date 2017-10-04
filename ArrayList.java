
public class ArrayList<T> implements MyList<T>{
	//test
	private int count;
	private T myItem;
	private T[] array;
	
	@Override
	public boolean add(int index, T t) {
		int i = index;
		if (i < 1 || i > count) {
			throw new
				IndexOutOfBoundsException(index + " < 0 or >= " + count);
		}
		else {
			array[index] = t;
		}
		return false;
	}

	@Override
	public boolean add(T t) {
		
		return false;
	}
	
	@Override
	public boolean clear() {
		
		T[] empty = (T[]) new T;
		array = empty;
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove(T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean set(int index, Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
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
