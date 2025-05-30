package String_Programs.With_SingleWord;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintUniqueValue {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5 };

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int num : arr) {

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		// Find occurence
		System.out.println(map);

		System.out.println("====================");

		// Print Unique value
		for (Map.Entry<Integer, Integer> hs : map.entrySet()) {
			if (hs.getValue() == 1) {
				System.out.println(hs.getKey() + " occurs " + hs.getValue() + " time");
			}
		}

		System.out.println("====================");

		// Print only Duplicate
		for (Map.Entry<Integer, Integer> hs : map.entrySet()) {
			if (hs.getValue() > 1) {
				System.out.println(hs.getKey() + " occurs " + hs.getValue() + " time");
			}
		}
	}
}
