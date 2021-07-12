public class DRoot {
	public static int digital_root(int n) {

		StringBuilder sb = new StringBuilder();

		int sum = 0;
		int digit = 0;
		while (n >= 10) {
			sb.append(n);
			for (int i = 0; i < sb.length(); i++) {
				digit = Character.getNumericValue(sb.charAt(i));
				sum += digit;
			}
			n = sum;
			sum = 0;
			sb.setLength(0);
		}

		return n;
	}

}