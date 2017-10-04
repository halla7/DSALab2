
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
		if (count == array.length) {
			doubleSize();
		}
		else {
			array[index] = t;
		}
		return false;
	}
	public void doubleSize() {
		array = (T[]) new Object[count*2];
	}
	@Override
	public boolean add(T t) {
		
		return false;
	}
	
	@Override
	public boolean clear() {
		
		empty = (T[]) new Object[0];
		array = empty;
		return false;
	}

	@Override
	public boolean contains(T t) {
		boolean flag = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(t)) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		return flag;
	}

	@Override
	public T get(int index) {
		return null;
	}

	@Override
	public int indexOf(T t) {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public T remove(int index) {
		return null;
	}

	@Override
	public T remove(T o) {
		return null;
	}

	@Override
	public boolean set(int index, Object element) {
		return false;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public MyList subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public T[] toArray() {
		return null;
	}

	@Override
	public boolean swap(int position1, int position2) {
		if(position1 < 1 || position 1 > array.length || position2 < 1 || position1 < array.length) {
			throw new 
				IndexOutOfBoundsException(index + " < 0 or >= " + count);
		}
		else {
			T item1 = array[position1];
			T item2 = array[position2];
			array[position1] = item2;
			array[position2] = item1;
		}
		return false;
	}

	@Override
	public boolean shift(int positions) {
		return false;
	}

}
