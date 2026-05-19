public class GeometricProgression {
	int start, current, ratio, num;

	public GeometricProgression(int s, int r, int n) {
		start = s;
		current = s;
		ratio = r;
		num = n;
	}

	public void printNums(Printer p) {
		for (int i = 0; i < num; i++) {
			p.print(current);
			next();
		}
	}

	public void next() {
		current = current * ratio;
	}

	public void reset() {
		current = start;
	}

	public static void main(String[] args) {
		GeometricProgression gp = new GeometricProgression(1, 5, 6);
		gp.printNums(new SimplePrinter());
		gp.reset();
		gp.printNums(new PrettyPrinter());
		System.out.println();
	}
}
