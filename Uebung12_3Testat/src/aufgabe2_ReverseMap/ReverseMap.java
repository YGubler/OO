package aufgabe2_ReverseMap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ReverseMap<L, R>{
	
	private Map<L, R> keyToValueMap = new ConcurrentHashMap<L, R>();
    private Map<R, L> valueToKeyMap = new ConcurrentHashMap<R, L>();
	
	void put (L left, R right){
		if(keyToValueMap.containsKey(left) || keyToValueMap.containsValue(right) || valueToKeyMap.containsKey(right) || valueToKeyMap.containsValue(left)){
			throw new IllegalArgumentException("Bereits vorhanden");
		} else {
			keyToValueMap.put(left, right);
			valueToKeyMap.put(right, left);		
		}
	}
	
	public R getRight(L left){
		if (keyToValueMap.containsKey(left)){			
			return keyToValueMap.get(left);
		} else {
			throw new IllegalArgumentException("nicht vorhanden");
		}
	}
	
	public L getLeft(R right){
		if (valueToKeyMap.containsKey(right)){
			return valueToKeyMap.get(right);			
		} else {
			throw new IllegalArgumentException("nicht vorhanden");
		}
	}
	
	
//	public Iterator<L> leftValues(){
//		keyToValueMap.e
//		class leftValuesIterator implements Iterator<L>{
//			private Iterator<L> itleft = null;
//			@Override
//			public boolean hasNext() {
//				System.out.println("test");
//				return itleft.hasNext();
//			}
//
//			@Override
//			public L next() {
//				return itleft.next();
//			}
//			
//		}
//	return new leftValuesIterator();
//	}
	
	public Iterator<R> rightValues(){
		return valueToKeyMap.entrySet().stream().map(i -> i.getKey()).iterator();
	}
	
	public int size(){
		return keyToValueMap.size();
	}
	
	public void clear(){
		keyToValueMap.clear();
		valueToKeyMap.clear();
	}


}
