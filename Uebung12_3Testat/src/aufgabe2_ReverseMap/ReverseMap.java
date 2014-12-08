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

	class ReverseMapIterator<K, V> implements Iterator<K> {
		private Iterator<K> itKey;
		private Map<K, V> key;
		private Map<V, K> value;
		private K current;

		public ReverseMapIterator(Map<K, V> key, Map<V, K> value) {
			itKey = key.keySet().iterator();
			this.key = key;
			this.value = value;
		}

		@Override
		public boolean hasNext() {
			return itKey.hasNext();
		}

		@Override
		public K next() {
			current = itKey.next();
			return current;
		}

		@Override
		public void remove() {
			value.remove(key.get(current));
			itKey.remove();
		}

	}

	public Iterator<L> leftValues() {
		return new ReverseMapIterator<L, R>(keyToValueMap, valueToKeyMap);
	}

	public Iterator<R> rightValues() {
		return new ReverseMapIterator<R, L>(valueToKeyMap, keyToValueMap);

		// Folgende Ansätze funktionieren nur ohne remove()
		// return valueToKeyMap.entrySet().stream().map(i ->
		// i.getKey()).iterator();
		// return valueToKeyMap.keySet().iterator();
	}

//	nur für for-each Implementation notwendig
//	public Iterable<L> getLeft() {
//		return new Iterable<L>() {
//			@Override
//			public Iterator<L> iterator() {
//				return keyToValueMap.keySet().iterator();
//			}
//		};
//	}

	public int size() {
		return keyToValueMap.size();
	}

	public void clear() {
		keyToValueMap.clear();
		valueToKeyMap.clear();
	}

}
