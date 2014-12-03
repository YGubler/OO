package aufgabe1_AdvancedStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class StreamExtensions {

	public static <T> T median(Stream<T> stream) {
		ArrayList<T> streamlist = new ArrayList<>();
		
		stream.sorted().forEach(streamlist::add);
		
		if(streamlist.isEmpty()){
			return null;
		} else if (streamlist.size() % 2 == 0) {
			return streamlist.get(streamlist.size() / 2);
		} else {
			return streamlist.get((streamlist.size() + 1) / 2);
		}
		
	}


	public static <T> Stream<T> revert(Stream<T> stream) {
		ArrayList<T> streamlist = new ArrayList<>();
		
		stream.forEach(streamlist::add);
		
		Collections.reverse(streamlist);
		return streamlist.stream();
	}

	public static <T> Stream<T> smallest(Stream<T> stream, int amount) throws Exception {
		
		ArrayList<T> streamlist = new ArrayList<>();
		stream.forEach(streamlist::add);
		
		if (amount > streamlist.size()){
			throw new Exception("amount grösser als Stream");
		} else {
			return streamlist.stream().limit(amount);
		}
		
		
	}

	public static <T> Stream<T> largest(Stream<T> stream, int amount) throws Exception {
		
		ArrayList<T> streamlist = new ArrayList<>();
		stream.forEach(streamlist::add);
		
		if (amount > streamlist.size()){
			throw new Exception("amount grösser als Stream");
		} else {
			return revert(streamlist.stream()).limit(amount);
		}
		
		
	}

}
