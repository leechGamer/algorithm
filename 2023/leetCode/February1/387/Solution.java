class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i=0;i<s.length();i++) {
			char element = s.charAt(i);
			if (map.containsKey(element)) {
				int val = map.get(element);
				map.put(element, ++val);
				continue;
			}
			map.put(element, 1);
		}

		for (char key : map.keySet()) {
			if (map.get(key) == 1) {
				return s.indexOf(key);
			}
		}
		return -1;
    }
}
