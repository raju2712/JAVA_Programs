package Array_Programs;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FindPositionsOfAllDuplicateElements {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 1, 2, 3, 3, 4 };

		LinkedHashMap<Integer, ArrayList<Integer>> lhm = new LinkedHashMap<>();

		for (int i = 0; i < a.length; i++) {

			if (lhm.containsKey(a[i])) {
				lhm.get(a[i]).add(i);
			} else {
				lhm.put(a[i], new ArrayList<Integer>());
			}
		}

		for (Entry<Integer, ArrayList<Integer>> map : lhm.entrySet()) {
			if (map.getValue().size() > 0) {
				System.out.println(map.getKey() + " " + map.getValue());
			}
		}

	}
}
