package jul_27_2020;

import java.util.*;

public final class GenericClassDemo <T>{ //<T> signifies that the class is generic
	private List<T> items;
	
	public GenericClassDemo() {}
	
	public GenericClassDemo(List<T> items) {
		this.items = items;
	}
	
	public Object issueItem() {
		
		//code
		
		return items.get(0);
	}
	
	public void returnItem(T item) {
		items.add(item);
	}
	
	public <T> void update(String name, T age){
	
		
	}
}
