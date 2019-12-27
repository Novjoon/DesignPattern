package Homework1;

public class Sorter {
	Compare com = new Namesort();

	public Sorter() {
	}

	public void setCompare(Compare com) {
		this.com = com;
	}

	public Object[] bubbleSort(Object[] objs) {
		for (int i = 0; i < objs.length - 1; i++) {
			for (int j = 0; j < objs.length - 1; j++) {
				if (com.compare(objs[j], objs[j + 1])) {
					Object temp = objs[j];
					objs[j] = objs[j + 1];
					objs[j + 1] = temp;
				}
			}
		}
		return objs;
	}
}

class Namesort implements Compare {
	public boolean compare(Object a, Object b) {
		FileInfo fa = (FileInfo) a;
		FileInfo fb = (FileInfo) b;
		int result = (fa.getName()).compareTo(fb.getName());
		if (result > 0) {
			return true;
		} else
			return false;

	}
}

class Typesort implements Compare {
	public boolean compare(Object a, Object b) {
		FileInfo fa = (FileInfo) a;
		FileInfo fb = (FileInfo) b;
		int result = fa.getType().compareTo(fb.getType());
		if (result > 0) {
			return true;
		} else
			return false;
	}
}

class Sizesort implements Compare {
	public boolean compare(Object a, Object b) {
		FileInfo fa = (FileInfo) a;
		FileInfo fb = (FileInfo) b;
		if (fa.getSize() > fb.getSize()) {
			return true;
		} else
			return false;
	}
}

class Datesort implements Compare {
	public boolean compare(Object a, Object b) {
		FileInfo fa = (FileInfo) a;
		FileInfo fb = (FileInfo) b;
		int result = fa.getModifiedDate().compareTo(fb.getModifiedDate());
		if (result > 0) {
			return true;
		} else
			return false;
	}
}
