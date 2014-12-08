package aufgabe2_ReverseMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class ReverseMap<L, R> {

	private Map<L, R> keyToValueMap = new HashMap<L, R>();
	private Map<R, L> valueToKeyMap = new HashMap<R, L>();

	void put(L left, R right) {
		if (keyToValueMap.containsKey(left) || keyToValueMap.containsValue(right) || valueToKeyMap.containsKey(right)
				|| valueToKeyMap.containsValue(left)) {
			throw new IllegalArgumentException("Bereits vorhanden");
		} else {
			keyToValueMap.put(left, right);
			valueToKeyMap.put(right, left);
		}
	}

	public R getRight(L left) {
		if (keyToValueMap.containsKey(left)) {
			return keyToValueMap.get(left);
		} else {
			throw new IllegalArgumentException("nicht vorhanden");
		}
	}

	public L getLeft(R right) {
		if (valueToKeyMap.containsKey(right)) {
			return valueToKeyMap.get(right);
		} else {
			throw new IllegalArgumentException("nicht vorhanden");
		}
	}

	class leftValuesIterator implements Iterator<L> {
		private Iterator<L> itleft = keyToValueMap.keySet().iterator();
		private L current;

		@Override
		public boolean hasNext() {
			return itleft.hasNext();
		}

		@Override
		public L next() {
			current = itleft.next();
			return current;
		}

		@Override
		public void remove() {
			valueToKeyMap.remove(keyToValueMap.get(current));
			itleft.remove();
		}

	}
	
	class rightValuesIterator implements Iterator<R> {
		private Iterator<R> itright = valueToKeyMap.keySet().iterator();
		private R current;

		@Override
		public boolean hasNext() {
			return itright.hasNext();
		}

		@Override
		public R next() {
			current = itright.next();
			return current;
		}

		@Override
		public void remove() {
			keyToValueMap.remove(valueToKeyMap.get(current));
			itright.remove();
		}

	}

	public Iterator<L> leftValues() {
		return new leftValuesIterator();
	}

	public Iterator<R> rightValues() {
		return new rightValuesIterator();
		
		//Folgende Ansätze funktionieren nur ohne remove()
		// return valueToKeyMap.entrySet().stream().map(i ->
		// i.getKey()).iterator();
//		return valueToKeyMap.keySet().iterator();
	}
	
	public Iterable<L> getLeft() {
		return new Iterable<L>() {
			@Override
			public Iterator<L> iterator() {
				return keyToValueMap.keySet().iterator();
			}
		};
	}

	public int size() {
		return keyToValueMap.size();
	}

	public void clear() {
		keyToValueMap.clear();
		valueToKeyMap.clear();
	}

}
