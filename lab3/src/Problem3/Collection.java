package Problem3;
import java.util.*;
public class Collection implements MyCollection {
	private ArrayDeque<MyCollection> v = new ArrayDeque<MyCollection>();

	public void push(Object x) {
		v.add((MyCollection) x);
	}
	
	public void remove(int i) {
		if(!isEmpty()) {
			v.remove(i);
		}    
		
	}

	public void pop_back() {
		v.remove(size()-1);
	}
	public void pop_front() {
		v.remove(0);
	}

	public boolean isEmpty() {
		if(v.size()==0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return v.size();
		
	}

	public void clear() {
		v.clear();
	}

	public void print() {
		System.out.println(v);
		
	}
}
