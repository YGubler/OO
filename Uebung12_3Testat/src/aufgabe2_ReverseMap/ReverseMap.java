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
	
	R getRight(L left){
		if (keyToValueMap.containsKey(left)){			
			return keyToValueMap.get(left);
		} else {
			throw new IllegalArgumentException("nicht vorhanden");
		}
	}
	
	L getLeft(R right){
		if (valueToKeyMap.containsKey(right)){
			return valueToKeyMap.get(right);			
		} else {
			throw new IllegalArgumentException("nicht vorhanden");
		}
	}
	
	Iterator<L> leftValues(){
		Iterator<L> leftIterator = keyToValueMap.keySet().iterator();
		
		while (leftIterator.hasNext()){
			L left = leftIterator.next();
		}
	return leftIterator;
		
	}
	
//	Iterator<R> rightValues(){
//		
//	}
//	
	int size(){
		return keyToValueMap.size();
	}
	
	void clear(){
		keyToValueMap.clear();
		valueToKeyMap.clear();
	}
}
