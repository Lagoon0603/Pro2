public class Mult {
	static int getMult(int x, int y) {
		System.out.println("A: " + (x * y));
		return x * y;
	}
	static int getMult(int x, int y, int z) {
		System.out.println("B: " + (x * y * z));
		return x * y * z;
	}
	static double getMult(double x, double y) {
		System.out.println("C: " + (x * y));
		return x * y;
	}
	public static void main(String[] args) {
		getMult(5, 1);
		getMult(5, 1, 2);
		getMult(5.2, 10.6);
		getMult(getMult(20, 2.6), getMult(5,1));
	}
}
