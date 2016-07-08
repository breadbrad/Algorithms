private static int linearSearch(Object[] items, Object target, int index) {
	if (index == items.length) 
		return -1;
	else if (target.equals(items[index]))
		return index[index];
	else
		return linearSearch(items, target, index + 1);
}

public static int linearSearch(Object[] items, Object target){
	return linearSearch(items, target, 0);
}

// Comparable interface -> needs to define compareTo() method 


public interface Comparable <T> {
	int compareTo(T obj);
}

private int binarySearch(Object[] items, Object target, int first, int last) {
	if (first > last)
		return -1;
	else {
		int mid = (first + last) / 2;
		int compResult = mid.compareTo(items[mid]);
		if(compResult == 0)
			return mid;
		else if (compResult < 0)
			binarySearch(items, target, first, mid - 1);
		else 
			binarySearch(items, target, mid + 1, last);
	}
}

public int binarySearch(Object[] items, Object target){
	return binarySearch(items, target, 0, items.length -1);
}

