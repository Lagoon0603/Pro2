public class IntSetUser {
	public static void main(String[] args) {
		IntSet s = new IntSet();
		s.init();
		System.out.println("count = " + s.count());
		s.add(2); s.add(0); s.add(2); s.add(6); s.add(2); s.add(4);
		System.out.println("0: " + s.find(0));
		System.out.println("1: " + s.find(1));
		System.out.println("2: " + s.find(2));
		System.out.println("3: " + s.find(3));
		System.out.println("4: " + s.find(4));
		System.out.println("5: " + s.find(5));
		System.out.println("6: " + s.find(6));
		System.out.println("count = " + s.count());
		System.out.println("Index for 0: " + s.getIndex(0));
		System.out.println("Index for 4: " + s.getIndex(4));
		s.remove(0);
		System.out.println("0: " + s.find(0));
		System.out.println("1: " + s.find(1));
		System.out.println("2: " + s.find(2));
		System.out.println("3: " + s.find(3));
		System.out.println("4: " + s.find(4));
		System.out.println("5: " + s.find(5));
		System.out.println("6: " + s.find(6));
		System.out.println("count = " + s.count());
		System.out.println("Index for 0: " + s.getIndex(0));
		System.out.println("Index for 4: " + s.getIndex(4));
	}
}
