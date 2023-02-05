class Solution {
    public int reverse(int x) {
        String n = String.valueOf(x);
		StringBuilder sb = new StringBuilder();
		if (x < 0) {
			n = n.substring(1);
		}
		for (int i=n.length()-1;i>-1;i--) {
			sb.append(n.substring(i, i+1));
		}
		Long reversed = Long.valueOf(sb.toString());
		if (x < 0 && (-1) * reversed >= Integer.MIN_VALUE) {
			return (int)((-1) * reversed);
		} else if (reversed <= Integer.MAX_VALUE) {
			return Integer.valueOf(sb.toString());
		}
		return 0;
    }
}
