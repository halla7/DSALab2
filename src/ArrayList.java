
public class ArrayList<T> implements MyList<T>{
	//test
	private int count;
	private T myItem;
	private T[] array;
	
	@SuppressWarnings("unchecked")
	public ArrayList() {
		array = (T[]) new Object[10];
		count = 0;
	}
	@Override
	public boolean add(int index, T t) {
		int i = index;
		if (i < 1 || i > count) {
			throw new
				IndexOutOfBoundsException(index + " < 0 or >= " + count);
		}
		if (count == array.length) {
			doubleSize();
			array[index] = t;
			count++;
		}
		else {
			array[index] = t;
			count++;
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	public void doubleSize() {
		array = (T[]) new Object[array.length * 2];
	}
	@Override
	public boolean add(T t) {
		if(count == array.length) {
			doubleSize();
			array[count] = t;
		} else {
			array[count] = t;
		}
		 count++;
		return false;
	}
	
	@Override
	public boolean clear() {
		
		@SuppressWarnings("unchecked")
		T[] empty = (T[]) new Object[0];
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
		if(index < 0 || index > count) {
			myItem = null;
			throw new
			IndexOutOfBoundsException(index + " < 0 or >= " + count);
			
		} else {
			myItem = array[index]; 
		}
		
		return myItem;
	}

	@Override
	public int indexOf(T t) {
		int returnValue = 0;
		for(int i = 0; i < count; i++) {
			if(array[i].equals(t)) {
				returnValue = i;
			} else {
				returnValue = -1;
			}
		}
		
		return returnValue;
	}

	@Override
	public boolean isEmpty() {
		boolean flag = false;
		if (count == 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public T remove(int index) {
		if (index < 0 || index > count) {
			throw new 
			IndexOutOfBoundsException(index + " < 0 or >= " + count);
		} else {
			array[index] = null;
			count--;
		}
		return null;
	}

	@Override
	public T remove(T o) {
		for(int i = 0; i < count; i++) {
			if(array[i].equals(o)) {
				array[i] = null;
				count--;
				i = count;
			}
		}
		return null;
	}

	@Override
	public boolean set(int index, T element) {
		if(index < 1 || index > count) {
			throw new 
			IndexOutOfBoundsException(index + " < 0 or >= " + count);
		} else {
			array[index] = element;
		}
		
		return false;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public MyList<T> subList(int fromIndex, int toIndex) {
		ArrayList<T> newList = new ArrayList<T>();
		if (fromIndex < 1 || fromIndex > count) {
			throw new
			IndexOutOfBoundsException(fromIndex + " < 0 or >= " + count);
		}
		if (toIndex < 1 || toIndex > count) {
			throw new
			IndexOutOfBoundsException(toIndex + " < 0 or >= " + count);
		} else {
		for(int i = fromIndex; i < toIndex; i++) {
			newList.add(i, array[i]);
			}
		}
		return newList;
	}

	@Override
	public T[] toArray() {
		return array;
	}

	@Override
	public boolean swap(int position1, int position2) {
		if(position1 < 1 || position1 > array.length || position2 < 1 || position1 < array.length) {
			throw new 
			IndexOutOfBoundsException(position1 + " < 0 or >= " + count);	
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
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Object[count];
		for(int i = 0; i < count; i++) {
			temp[i + positions] = array[i];
		}
		array = temp;
		return false;
	}

}
