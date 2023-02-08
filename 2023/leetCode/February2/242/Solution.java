class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) {
        return false;
      }
      HashMap<Character, Integer> map = new HashMap<>();
      for (int i=0;i<s.length();i++) {
        char key = s.charAt(i);
        if (map.containsKey(s.charAt(i))) {
          int value = map.get(key);
          map.put(key, ++value);
          continue;
        }
        map.put(key, 1);
      }

      for (int i=0;i<t.length();i++) {
        char key = t.charAt(i);
        if (!map.containsKey(key)) {
          return false;
        } else if (map.get(key) <= 0) {
          return false;
        }
        int value = map.get(key);
        map.put(key, --value);
      }
      return true;
    }
}
