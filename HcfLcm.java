package LeetCodeArray;

public class HcfLcm {
	public static int calHCF(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	public int Lcm(int a, int b) {
		int hcf = calHCF(a, b);
		return (a * b) / hcf;
	}

	public static void main(String args[]) {
		int a = 12;
		int b = 56;

		int hcf = calHCF(a, b);
		System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
		// calHCF(a, b);
		HcfLcm lcm = new HcfLcm();
		System.out.println("Lcm is = " + lcm.Lcm(a, b));
	}
}
